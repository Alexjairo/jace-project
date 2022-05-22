import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes , RouterModule} from '@angular/router'
import {ForgotPaswordComponent} from './pages/forgot-pasword/forgot-pasword.component';
import {LoginComponent} from './pages/login/login.component';
import {RegistroComponent} from './pages/registro/registro.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'forgot', component: ForgotPaswordComponent },
      { path: 'login', component: LoginComponent },
      { path: 'registro', component: RegistroComponent },
      { path: '**', redirectTo: 'login' },
    ]
  }
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forChild( routes)
  ]
})
export class AuthRoutingModule { }
