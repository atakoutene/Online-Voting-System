import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-oauth-provider',
  templateUrl: './oauth-provider.component.html',
  styleUrls: ['./oauth-provider.component.scss'],
})
export class OauthProviderComponent implements OnInit {
  @Input() provider = '';
  constructor() {}

  ngOnInit(): void {}
}
