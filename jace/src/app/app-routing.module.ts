import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'auth',
loadChildren: ()=> import('./auth/auth.module').then(m => m.AuthModule)
},
{path:'envios',
loadChildren: ()=> import('./envios/envios.module').then(m => m.EnviosModule)
},
{path:'transporte',
loadChildren: ()=> import('./transporte/transporte.module').then(m => m.TransporteModule)
},
{path:'profile',
loadChildren: ()=> import('./user/user.module').then(m => m.UserModule)
},
{path:'log',
loadChildren: ()=> import('./log/log.module').then(m => m.LogModule)
},

{
  path:'**',
  redirectTo: 'profile'
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
