import { Component, OnInit } from '@angular/core';
import { PerfilService } from './perfil.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

  user: any[] = []

  constructor(
    private appService: PerfilService
    ){
    }
      ngOnInit(): void {
        this.appService.getAll()
        .subscribe((data: any ) => {
          this.user = data
        });
      }
      title = 'Perfil';

}
