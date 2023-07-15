import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Session } from 'src/app/core/models/session.model';
import { NavigationService } from 'src/app/core/services/navigation.service';
import { SessionService } from 'src/app/core/services/session.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
})
export class DashboardComponent implements OnInit {
  sessions$!: Observable<Session[]>;

  constructor(
    private navigation: NavigationService,
    private route: ActivatedRoute,
    private sessions: SessionService
  ) {}

  ngOnInit(): void {
    this.sessions$ = this.sessions.getAll();
  }

  createElection() {
    this.navigation.navigateTo(['../new-election'], this.route);
  }
}
