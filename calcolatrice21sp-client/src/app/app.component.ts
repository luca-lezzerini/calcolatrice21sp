import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { CalcolatriceResDto } from './calcolatrice-res-dto';
import { CalcolatriceReqDto } from './calcolatrice.-req-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  op1s: number;
  op2s: number;
  op1d: number;
  op2d: number;
  op1m: number;
  op2m: number;
  op1q: number;
  op2q: number;
  op1p: number;
  op2p: number;
  op1r: number;
  op2r: number;
  risultatoSomma: number;
  risultatoDifferenza: number;
  risultatoProdotto: number;
  risultatoDivisione: number;
  risultatoModulo: number;
  risultatoCasuale: number;
  
  constructor(private http: HttpClient) { }

  somma() {
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1s;
    dto.op2 = this.op2s;

    let ox: Observable<CalcolatriceResDto> = this.http
      .post<CalcolatriceResDto>("http://localhost:8080/somma",
        dto);
    ox.subscribe(r => this.risultatoSomma = r.risultato);
  }

  sottrai() {
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1d;
    dto.op2 = this.op2d;

    let ox: Observable<CalcolatriceResDto> = this.http
      .post<CalcolatriceResDto>("http://localhost:8080/sottrai",
        dto);
    ox.subscribe(r => this.risultatoDifferenza = r.risultato);
  }

  moltiplica() {
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1m;
    dto.op2 = this.op2m;

    let ox: Observable<CalcolatriceResDto> = this.http
      .post<CalcolatriceResDto>("http://localhost:8080/moltiplica",
        dto);
    ox.subscribe(r => this.risultatoProdotto = r.risultato);
  }

  dividi() {
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1q;
    dto.op2 = this.op2q;

    let ox: Observable<CalcolatriceResDto> = this.http
      .post<CalcolatriceResDto>("http://localhost:8080/dividi",
        dto);
    ox.subscribe(r => this.risultatoDivisione = r.risultato);
  }

  modulo() {
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1p;
    dto.op2 = this.op2p;

    let ox: Observable<CalcolatriceResDto> = this.http
      .post<CalcolatriceResDto>("http://localhost:8080/modulo",
        dto);
    ox.subscribe(r => this.risultatoModulo = r.risultato);
  }
  casuale (){
    let dto = new CalcolatriceReqDto();
    dto.op1 = this.op1r;
    dto.op2 = this.op2r;
    let ox: Observable<CalcolatriceResDto> = this.http
    .post<CalcolatriceResDto>("http://localhost:8080/casuale",
      dto);
  ox.subscribe(r => this.risultatoCasuale = r.risultato);
  }


}
