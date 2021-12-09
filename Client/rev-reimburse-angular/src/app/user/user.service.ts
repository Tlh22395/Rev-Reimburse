import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseURL = "/api/users";

  constructor(private http: HttpClient) { }

  getAllUsersService(): Observable<User[]>
  {
    return this.http.get<User[]>(this.baseURL);
  }

  getUserService(user: User): Observable<User>
  {
    return this.http.get<User>(this.baseURL + "/login" + user.userID);
  }

  getUserByIDService(userID: number): Observable<User>
  {
    return this.http.get<User>(this.baseURL + "/" + userID);
  }

  getUserIDService(username: string): Observable<number>
  {
    return this.http.get<number>(this.baseURL + "/id/" + username);
  }

  addUserService(user: User): Observable<User>
  {
    return this.http.post<User>(this.baseURL, user);
  }

  updateUserService(user: User): Observable<User>
  {
    return this.http.put<User>(this.baseURL + "/" + user.userID, user);
  }

  removeUserService(user: User): Observable<User>
  {
    return this.http.delete<User>(this.baseURL + "/r/" + user.userID);
  }

  userPasswordVerification(user: User): Observable<boolean>
  {
    return this.http.get<boolean>(this.baseURL + "/verify/" + user.userID)
  }
}
