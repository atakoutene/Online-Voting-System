import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Session } from 'src/app/core/models/session.model';
import { NavigationService } from 'src/app/core/services/navigation.service';
import { SessionService } from 'src/app/core/services/session.service';

@Component({
  selector: 'app-create-election',
  templateUrl: './create-election.component.html',
  styleUrls: ['./create-election.component.scss'],
})
export class CreateElectionComponent implements OnInit {
  newElectionForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private navigation: NavigationService,
    private sessions: SessionService
  ) {
    this.newElectionForm = this.fb.group({
      title: [''],
      startDate: [new Date()],
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    const formValue = this.newElectionForm.value;
    const { title, startDate } = formValue;
    this.sessions.add({
      title,
      start_date: new Date(startDate),
      published: false,
    });
    this.close();
  }

  close() {
    this.navigation.goBack();
  }
}
