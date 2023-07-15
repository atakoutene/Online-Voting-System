enum Role {
  'ADMIN',
  'ENROLLER',
  'VOTER',
}
export interface Person {
  id: String;
  email: String;
  name: String;
  dob: Date;
  role: Role;
  session_id: String;
  voted: boolean;
  muted: boolean;
}
