import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SwiperModule } from 'swiper/angular';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { SharedModule } from './shared/shared.module';
import { AuthModule } from './core/auth/auth.module';
import { ReactiveFormsModule } from '@angular/forms';
import { CreateElectionComponent } from './features/admin/components/create-election/create-election.component';
import { AdminComponent } from './features/admin/admin.component';
import { RouterModule } from '@angular/router';
import { DashboardComponent } from './features/admin/components/dashboard/dashboard.component';
import { ElectionComponent } from './features/admin/components/election/election.component';
import { ChooseUserTypeComponent } from './features/admin/components/election/components/choose-user-type/choose-user-type.component';
import { AddEnrollerComponent } from './features/admin/components/election/components/add-enroller/add-enroller.component';
import { AddCandidateComponent } from './features/admin/components/election/components/add-candidate/add-candidate.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateElectionComponent,
    AdminComponent,
    DashboardComponent,
    ElectionComponent,
    ChooseUserTypeComponent,
    AddEnrollerComponent,
    AddCandidateComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CoreModule,
    SharedModule,
    AuthModule,
    ReactiveFormsModule,
    RouterModule,
    SwiperModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
