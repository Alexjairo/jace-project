import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(
    private http:HttpClient
  ) { }

  getAll(){
    return this.http.get('http://localhost:8080/apiJace/users');
  }
  search(data: any){
    return this.http.post('http://localhost:8080/apiJace/empleado', data);
  }
}
