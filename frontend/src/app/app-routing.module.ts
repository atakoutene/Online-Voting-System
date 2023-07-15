import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './core/auth/components/auth/auth.component';
import { SignupComponent } from './core/auth/components/signup/signup.component';
import { LoginComponent } from './core/auth/components/login/login.component';
import { ForgotPasswordComponent } from './core/auth/components/forgot-password/forgot-password.component';
import { CheckMailComponent } from './core/auth/components/check-mail/check-mail.component';
import { ResetPasswordComponent } from './core/auth/components/reset-password/reset-password.component';
import { CreateElectionComponent } from './features/admin/components/create-election/create-election.component';
import { AdminComponent } from './features/admin/admin.component';
import { DashboardComponent } from './features/admin/components/dashboard/dashboard.component';
import { ElectionComponent } from './features/admin/components/election/election.component';
import { ChooseUserTypeComponent } from './features/admin/components/election/components/choose-user-type/choose-user-type.component';
import { AddEnrollerComponent } from './features/admin/components/election/components/add-enroller/add-enroller.component';
import { AddCandidateComponent } from './features/admin/components/election/components/add-candidate/add-candidate.component';

const routes: Routes = [
  {
    path: 'auth',
    component: AuthComponent,

    children: [
      {
        path: '',
        component: SignupComponent,
      },
      {
        path: 'login',
        component: LoginComponent,
      },
      {
        path: 'forgot-password',
        component: ForgotPasswordComponent,
      },
      {
        path: 'check-mail',
        component: CheckMailComponent,
      },
      {
        path: 'reset-password',
        component: ResetPasswordComponent,
      },
    ],
  },
  {
    path: 'admin',
    component: AdminComponent,
    children: [
      {
        path: '',
        component: DashboardComponent,
        data: {
          backgroundNeutral: true,
        },
      },
      {
        path: 'new-election',
        component: CreateElectionComponent,
        data: {
          backgroundNeutral: false,
        },
      },
      {
        path: 'election/:id',
        children: [
          {
            path: '',
            component: ElectionComponent,
            data: {
              backgroundNeutral: true,
            },
            children: [
              {
                path: 'choose-user-type',
                component: ChooseUserTypeComponent,
              },
            ],
          },
          {
            path: 'add-enroller',
            component: AddEnrollerComponent,
          },
          {
            path: 'add-candidate',
            component: AddCandidateComponent,
          },
        ],
      },
    ],
  },
  {
    path: '',
    redirectTo: 'admin',
    pathMatch: 'full',
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
