import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { VeiculosCreateComponent } from './components/views/veiculos/veiculos-create/veiculos-create.component';
import { VeiculosDeleteComponent } from './components/views/veiculos/veiculos-delete/veiculos-delete.component';
import { VeiculosReadComponent } from './components/views/veiculos/veiculos-read/veiculos-read.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'veiculos',
    component: VeiculosReadComponent
  },
  {
    path: 'veiculos/create',
    component: VeiculosCreateComponent
  },
  {
    path: 'veiculos/delete/:id',
    component: VeiculosDeleteComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
