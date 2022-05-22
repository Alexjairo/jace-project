import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  empleado: any[] = [];
  formulario !: FormGroup



  constructor(
private appService: LoginService,

    private fb:FormBuilder

  ) { }

  ngOnInit(): void {
    this.formulario =this.fb.group({
      dni:[,Validators.required]
})
this.appService.search(this.formulario.value)
.subscribe((data: any ) => this.empleado=data);
  }

}
