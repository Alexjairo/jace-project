import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EnviosRoutingModule } from './envios-routing.module';
import { ListadoComponent } from './pages/listado/listado.component';
import { EnvioComponent } from './pages/envio/envio.component';
import { SeguroComponent } from './pages/seguro/seguro.component';
import { FormEnvioComponent } from './pages/form-envio/form-envio.component';
import { RouterModule } from '@angular/router';
import { TransporteModule } from '../transporte/transporte.module';
import { FormSeguroComponent } from './pages/form-seguro/form-seguro.component';




@NgModule({
  declarations: [
    ListadoComponent,
    EnvioComponent,
    SeguroComponent,
    FormEnvioComponent,
    FormSeguroComponent
  ],
  imports: [
    CommonModule,
    EnviosRoutingModule,

    // RouterModule.forRoot([
    //  {path:'/envios/envio',
    //   loadChildren: () => import('../transporte/transporte.module').then(mod => mod.TransporteModule),}
    //   // children: [
    //   //   {path:'**'},
    //   //   {component:ListadoComponent},
    //   //   {component:EnvioComponent},
    //   //   {component:SeguroComponent},
    //   //   {component:FormEnvioComponent}
    //   // ] }

    // ])
  ],
  exports:[
    CommonModule,
    EnviosRoutingModule,
    EnvioComponent
  ]

})
export class EnviosModule { }
