import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Veiculos } from './veiculos-read/veiculo.model';

@Injectable({
  providedIn: 'root'
})
export class VeiculosService {

  baseUrl: String = environment.baseUrl;

  constructor(private http: HttpClient) { }

  findAll():Observable<Veiculos[]>{
    const url = `${this.baseUrl}/veiculos`
    return this.http.get<Veiculos[]>(url)
  }

  findById(id: String): Observable<Veiculos>{
    const url = `${this.baseUrl}/veiculos/${id}`
    return this.http.get<Veiculos>(url)
  }

  create(veiculos: Veiculos): Observable<Veiculos>{
    const url = `${this.baseUrl}/veiculos`
    return  this.http.post<Veiculos>(url, veiculos);
  }

  delete(id: String):Observable<void>{
    const url = `${this.baseUrl}/veiculos/${id}`
    return this.http.delete<void>(url)
  }
}
