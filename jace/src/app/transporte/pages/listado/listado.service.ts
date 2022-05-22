import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListadoService {

  constructor(
    private http:HttpClient
  ) { }

  getAll(){
    return this.http.get('http://localhost:8080/apiJace/vehiculos');
  }
  create(data:any){
    return this.http.get('http://localhost:8080/apiJace/vehiculoAdd', data);
  }
}
