import { Component,HostBinding, OnInit } from '@angular/core';
import { FormService } from './form.service';

@Component({
  selector: 'app-form-envio',
  templateUrl: './form-envio.component.html',
  styleUrls: ['./form-envio.component.css']
})




export class FormEnvioComponent implements OnInit {

  @HostBinding('change-form')
  isChange = false;

  constructor(
    private FromService:FormService
  ) { }

  ngOnInit(): void {
    this.FromService.change.subscribe( isChange => {
      this.isChange = this.isChange
    })
  }
}
