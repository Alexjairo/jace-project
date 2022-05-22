import { Component, OnInit } from '@angular/core';
import { ListadoService } from './listado.service';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {
 car: any[] =[]
  constructor(
    private appService:ListadoService
  ) { }

  ngOnInit(): void {
 this.appService.getAll()
 .subscribe((data:any)=>{
   this.car = data
 });
  }
tittle ='Transporte'
}
