import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListadoComponent } from './pages/listado/listado.component';
import { EnvioComponent } from './pages/envio/envio.component';

const routes: Routes = [
{
  path: '',
  children:[
    {path:'listado', component:ListadoComponent},
    {path:'envio', component:EnvioComponent},
    {path:'**', redirectTo:'listado'},
  ]
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EnviosRoutingModule { }
