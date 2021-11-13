import { Component } from '@angular/core';

import {NttDataService} from "./services/ntt-data.service";
import {ResultadoBusquedaPorNombre} from "./interfaces/resultado-busqueda-por-nombre";
import {BusquedaPorNombre} from "./models/busqueda-por-nombre";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'NTTData-ui';

  constructor(
    private nttDataService: NttDataService
  ) {}


  resultados : ResultadoBusquedaPorNombre = new class implements ResultadoBusquedaPorNombre{
    nombres = [];
  }
  dnaString = "" ;
  busquedaPorNombre = new BusquedaPorNombre();



  buscarNombre() {
    this.nttDataService.buscarNombre(this.busquedaPorNombre)
    .subscribe(resultadoObtenido => {
      // @ts-ignore
      this.resultados = resultadoObtenido;
    });
  }
}
