import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PerfilComponent } from '../user/pages/perfil/perfil.component';

const routes: Routes = [
  {
    path :'',
    children:[
      {path:'profile', component:PerfilComponent},
      { path: '**', redirectTo: 'profile'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
