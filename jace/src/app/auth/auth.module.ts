import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './pages/login/login.component';
import { RegistroComponent } from './pages/registro/registro.component';
import { ForgotPaswordComponent } from './pages/forgot-pasword/forgot-pasword.component';
import { AuthRoutingModule } from './auth-routing.module';



@NgModule({
  declarations: [
    LoginComponent,
    RegistroComponent,
    ForgotPaswordComponent
  ],
  imports: [
    CommonModule,
    AuthRoutingModule
  ],
  exports:[
  LoginComponent
  ]
})
export class AuthModule { }
