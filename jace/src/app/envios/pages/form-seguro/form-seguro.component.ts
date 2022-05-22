import { Component, OnInit, EventEmitter, HostListener } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormService } from '../form-envio/form.service';
@Component({
  selector: 'app-form-seguro',
  templateUrl: './form-seguro.component.html',
  styleUrls: ['./form-seguro.component.css']
})
export class FormSeguroComponent implements OnInit {
formulario!: FormGroup;
  constructor(
    private FormService: FormService,
    private fb:FormBuilder
  ) { }

  ngOnInit(): void {
    this.formulario = this.fb.group({
      tipo_seguro:[, [Validators.required, Validators.maxLength(20)]]
    })
  }
  @HostListener('click')
  click() {
    this.FormService.toggle();
  }

  create(){
    console.log("asdajsdhjka",this.formulario.value)

  }
}
