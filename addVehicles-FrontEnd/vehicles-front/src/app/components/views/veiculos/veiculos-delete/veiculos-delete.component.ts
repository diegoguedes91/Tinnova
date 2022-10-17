import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VeiculosService } from '../veiculos.service';
import { Veiculos } from '../veiculos-read/veiculo.model';

@Component({
  selector: 'app-veiculos-delete',
  templateUrl: './veiculos-delete.component.html',
  styleUrls: ['./veiculos-delete.component.css']
})
export class VeiculosDeleteComponent implements OnInit {

  veiculos: Veiculos = {
    id: '',
    veiculo: '',
    marca: '',
    ano: 0,
    descricao: '',
    vendido: false,
    created: 2022,
    updated: 2022
  }

  constructor(private service: VeiculosService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.veiculos.id = this.route.snapshot.paramMap.get('id')!
    this.findByid()
  }

  findByid(): void{
    this.service.findById(this.veiculos.id!).subscribe((resposta) =>{
      this.veiculos = resposta
    })
  }

  delete():void{
    this.service.delete(this.veiculos.id!).subscribe((resposta) => {
      this.router.navigate(['veiculos'])
    })
  }
}
