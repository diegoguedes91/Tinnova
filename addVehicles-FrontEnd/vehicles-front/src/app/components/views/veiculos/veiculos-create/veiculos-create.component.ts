import { Component, OnInit } from '@angular/core';
import { Veiculos } from '../veiculos-read/veiculo.model';
import { VeiculosService } from '../veiculos.service';

@Component({
  selector: 'app-veiculos-create',
  templateUrl: './veiculos-create.component.html',
  styleUrls: ['./veiculos-create.component.css']
})
export class VeiculosCreateComponent implements OnInit {

  veiculos: Veiculos ={
    veiculo: '',
    marca: '',
    ano: 0,
    descricao: '',
    vendido: false,
    created: 2022,
    updated: 2022,
  }
  router: any;

  constructor(private service: VeiculosService) { }

  ngOnInit(): void {
  }

  create(): void{
    this.service.create(this.veiculos).subscribe((resposta) => {
        console.log(resposta)
    })
  }

}
