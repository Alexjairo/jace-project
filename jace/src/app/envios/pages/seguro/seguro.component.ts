import { Component, OnInit } from '@angular/core';
import { SeguroService } from './seguro.service';

@Component({
  selector: 'app-seguro',
  templateUrl: './seguro.component.html',
  styleUrls: ['./seguro.component.css']
})
export class SeguroComponent implements OnInit {
seguro:any[] =[];
  constructor(
    private appService: SeguroService
    ){
    }
      ngOnInit(): void {
        this.appService.getAll()
        .subscribe((data: any ) => {
          this.seguro = data
        });
      }
tittle='Seguro';
}
