import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AuthModule } from './auth/auth.module';
import { SharedModule } from '../shared/shared.module';
import { LayoutComponent } from './shell/layout/layout.component';

@NgModule({
  imports: [CommonModule],
  declarations: [LayoutComponent],
  exports: [LayoutComponent],
})
export class CoreModule {}
