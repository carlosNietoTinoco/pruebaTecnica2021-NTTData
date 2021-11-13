import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {BusquedaPorNombre} from "../models/busqueda-por-nombre";

@Injectable({
  providedIn: 'root'
})
export class NttDataService {

  constructor(private http: HttpClient) { }

  buscarNombre(busquedaPorNombre: BusquedaPorNombre) {
    const path = `http://localhost:8080/api/buscar`;
    return this.http.post(path,  busquedaPorNombre, {
      headers: {'Content-Type':'application/json; charset=utf-8',
        'access_control_allow_origin':'*',
        'access_control_allow_headers' : 'origin, content-type, accept',
        'access_control_allow_methods' : 'POST, GET, OPTIONS, DELETE'}
    });
  }
}
