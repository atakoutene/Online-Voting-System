import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InputBoxComponent } from './input-box/input-box.component';
import { ButtonComponent } from './button/button.component';
import { OauthProviderComponent } from './oauth-provider/oauth-provider.component';
import { DividerComponent } from './divider/divider.component';
import { PieChartComponent } from './pie-chart/pie-chart.component';
import { SwiperModule } from 'swiper/angular';
import { NavbarMobileComponent } from './navbar-mobile/navbar-mobile.component';

@NgModule({
  declarations: [
    InputBoxComponent,
    ButtonComponent,
    OauthProviderComponent,
    DividerComponent,
    PieChartComponent,
    NavbarMobileComponent,
  ],
  imports: [CommonModule],
  exports: [
    InputBoxComponent,
    ButtonComponent,
    OauthProviderComponent,
    DividerComponent,
    PieChartComponent,
    NavbarMobileComponent,
  ],
})
export class SharedModule {}
