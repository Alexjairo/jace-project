import { Injectable, Output, EventEmitter  } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FormService {

  constructor() { }
  isChange = false;
  @Output() change: EventEmitter<boolean> = new EventEmitter();

  toggle() {
    this.isChange = !this.isChange;
    this.change.emit(this.isChange);
  }
}
