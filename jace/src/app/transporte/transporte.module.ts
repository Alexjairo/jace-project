import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TransporteRoutingModule } from './transporte-routing.module';
import { AgregarComponent } from './pages/agregar/agregar.component';
import { ListadoComponent } from './pages/listado/listado.component';
import { TransporteComponent } from './pages/transporte/transporte.component';
import { EnviosModule } from '../envios/envios.module';



@NgModule({
  declarations: [
    AgregarComponent,
    ListadoComponent,
    TransporteComponent
  ],
  imports: [
    CommonModule,
    TransporteRoutingModule,


  ],
  exports:[
    ListadoComponent,
    TransporteComponent,
    EnviosModule,
    AgregarComponent
  ]
})
export class TransporteModule { }
















