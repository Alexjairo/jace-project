import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { PerfilComponent } from './pages/perfil/perfil.component';


@NgModule({
  declarations: [
    PerfilComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule
  ],
  exports:[  CommonModule,
    UserRoutingModule,PerfilComponent
  ]
})
export class UserModule { }
