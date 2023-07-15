import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';
import { Session } from '../models/session.model';
import { from } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SessionService {
  private INITIAL_DATA: Session[] = [
    {
      id: 'ID1',
      title: 'School Presidence',
      published: false,
      start_date: new Date(),
    },
    {
      id: 'ID2',
      title: 'School Presidence',
      published: false,
      start_date: new Date(),
    },
  ];

  private sessions = new BehaviorSubject<Session[]>(this.INITIAL_DATA);
  public sessions$ = this.sessions.asObservable();

  constructor() {}

  getAll() {
    return from(
      new Promise<Session[]>((res, reject) => {
        setTimeout(() => {
          res(this.sessions.getValue());
        }, 500);
      }).then((data) => data)
    );
  }

  add(session: Session) {
    let sessions = this.sessions.getValue();
    let sessionsCopy = sessions.slice();
    let length = sessionsCopy.length;

    // persist in backend
    return from(
      new Promise<Session>((resolve, reject) => {
        setTimeout(() => {
          console.log('POST REQUEST of: ' + session.title);
          session.id = 'ID' + (length + 1);
          resolve(session);
        }, 500);
      }).then((data) => {
        sessionsCopy.push(data);
        // Persist in application
        this.sessions.next(sessionsCopy);
      })
    );
  }
}
