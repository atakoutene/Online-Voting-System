import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEnrollerComponent } from './add-enroller.component';

describe('AddEnrollerComponent', () => {
  let component: AddEnrollerComponent;
  let fixture: ComponentFixture<AddEnrollerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEnrollerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEnrollerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
