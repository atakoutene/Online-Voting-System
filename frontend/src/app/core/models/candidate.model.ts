import { Person } from './person.model';

export interface Candidate extends Person {
  id: String;
  name: String;
  description: String;
  plan: String;
  session_id: String;
  per_id: String;
}
