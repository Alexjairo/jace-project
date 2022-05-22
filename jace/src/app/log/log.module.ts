import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LogRoutingModule } from './log-routing.module';
import { FindComponent } from './pages/find/find.component';


@NgModule({
  declarations: [
    FindComponent
  ],
  imports: [
    CommonModule,
    LogRoutingModule
  ]
})
export class LogModule { }
