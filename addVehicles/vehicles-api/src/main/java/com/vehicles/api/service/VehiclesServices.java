package com.vehicles.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicles.api.dto.VehiclesDTO;
import com.vehicles.api.model.Vehicles;
import com.vehicles.api.repository.VehiclesRepository;

@Service
public class VehiclesServices {
	
	@Autowired 
	private VehiclesRepository repository;  

	public Vehicles findById(Long id) {
		Optional<Vehicles> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public Vehicles update(Long id, VehiclesDTO objDto) {
		Vehicles obj = findById(id);
		obj.setVeiculo(objDto.getVeiculo());
		obj.setMarca(objDto.getMarca());
		obj.setAno(objDto.getAno());
		obj.setDescricao(objDto.getDescricao());
		obj.setVendido(objDto.getVendido());
		obj.setCreated(objDto.getCreated());
		obj.setUpdated(objDto.getUpdated());
		return repository.save(obj);
	}

	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}



}
