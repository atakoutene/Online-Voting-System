import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import {
  ActivatedRoute,
  NavigationExtras,
  Route,
  Router,
} from '@angular/router';

@Component({
  selector: 'app-add-enroller',
  templateUrl: './add-enroller.component.html',
  styleUrls: ['./add-enroller.component.scss'],
})
export class AddEnrollerComponent implements OnInit {
  addEnrollerForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.addEnrollerForm = this.fb.group({
      name: [''],
      email: [''],
      phone: [''],
      enrollerID: [''],
      enrollerKey: [''],
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    console.log(this.addEnrollerForm.value);
    this.router.navigate(['../'], { relativeTo: this.route });
  }
}
