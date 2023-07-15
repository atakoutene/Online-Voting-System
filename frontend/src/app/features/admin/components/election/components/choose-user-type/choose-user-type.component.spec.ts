import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChooseUserTypeComponent } from './choose-user-type.component';

describe('ChooseUserTypeComponent', () => {
  let component: ChooseUserTypeComponent;
  let fixture: ComponentFixture<ChooseUserTypeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChooseUserTypeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChooseUserTypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
