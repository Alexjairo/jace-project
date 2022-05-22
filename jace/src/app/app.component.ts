import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements
OnInit {
  view:boolean=true;
  view2:boolean=false;
mostrar(){
  this.view=false;
  this.view2=true;
}
empleado: any[] = [];
formulario !: FormGroup

constructor(
private appService: AppService,
private fb:FormBuilder
){
}
  ngOnInit(): void {
    this.formulario =this.fb.group({
          dni:[,Validators.required]
    })
    this.appService.search(this.formulario.value)
    .subscribe((data: any ) => this.empleado=data);
  }
  title = 'Home';
}
