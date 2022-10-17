import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VeiculosService } from '../veiculos.service';
import { Veiculos } from './veiculo.model';

@Component({
  selector: 'app-veiculos-read',
  templateUrl: './veiculos-read.component.html',
  styleUrls: ['./veiculos-read.component.css']
})
export class VeiculosReadComponent implements OnInit {

  veiculos: Veiculos[] = []

  displayedColumns: string[] = ['id', 'veiculo', 'marca', 'ano', 'descricao', 'vendido', 'created', 'updated', 'acao'];

  constructor(private service: VeiculosService, private router: Router) { }

  ngOnInit(): void {
    this.findall();
  }

  findall(){
    this.service.findAll().subscribe(resposta => {
      console.log(resposta);
      this.veiculos = resposta;
    })
  }

  navegarParaCategoriaCrate(){
    this.router.navigate(["veiculos/create"])
  }


}
