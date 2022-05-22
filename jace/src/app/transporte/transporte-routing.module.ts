import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from '../transporte/pages/agregar/agregar.component';
import { ListadoComponent } from '../transporte/pages/listado/listado.component';
import { TransporteComponent } from './pages/transporte/transporte.component';

const routes: Routes = [
  {
  path: '',
  children:[
    {path:'crearCoche', component:AgregarComponent},
    // {path:'editarCoche', component:EditarComponent},
    {path:'listadoCoche', component:ListadoComponent},
    {path:'transporte', component:TransporteComponent},
    {path:'**', redirectTo:'listadoCoche'},
  ]
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TransporteRoutingModule { }
