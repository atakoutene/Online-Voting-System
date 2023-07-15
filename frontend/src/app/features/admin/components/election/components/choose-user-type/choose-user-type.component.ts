import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription, fromEvent, map } from 'rxjs';
import { NavigationService } from 'src/app/core/services/navigation.service';

@Component({
  selector: 'app-choose-user-type',
  templateUrl: './choose-user-type.component.html',
  styleUrls: ['./choose-user-type.component.scss'],
})
export class ChooseUserTypeComponent implements OnInit, OnDestroy {
  userType: FormGroup;
  sub!: Subscription;

  constructor(
    private fb: FormBuilder,
    private navigationService: NavigationService,
    private route: ActivatedRoute
  ) {
    this.userType = this.fb.group({
      type: [''],
    });
  }

  ngOnInit(): void {}

  ngAfterViewInit() {
    const container = document.querySelector(
      '.modal-container'
    ) as HTMLDivElement;
    this.sub = fromEvent(container, 'click')
      .pipe(
        map((evt) => evt.target as HTMLElement),
        map((target) => target.closest('.box')),
        map((element) => element == null)
      )
      .subscribe((out) => {
        if (out) {
          this.close();
        }
      });
  }
  onSubmit() {
    let userType = this.userType.value.type;
    this.navigationService.navigateTo([`../add-${userType}`], this.route);
  }

  close() {
    this.navigationService.goBack();
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }
}
