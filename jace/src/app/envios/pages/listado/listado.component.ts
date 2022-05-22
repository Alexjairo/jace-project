import { Component, OnInit } from '@angular/core';
import { ListenviosService } from './listenvios.service';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements
OnInit {
envio: any[] = [];


constructor(
private appService: ListenviosService
){
}
  ngOnInit(): void {
    this.appService.getAll()
    .subscribe((data: any ) => {
      this.envio = data
    });
  }
  title = 'Envios';
}
