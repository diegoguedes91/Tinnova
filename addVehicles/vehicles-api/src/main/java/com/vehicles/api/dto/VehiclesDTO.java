package com.vehicles.api.dto;

import java.util.Date;
import com.vehicles.api.enums.VehicleBrand;
import com.vehicles.api.model.Vehicles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehiclesDTO {

	private Long id; 
	private String veiculo; 
	private VehicleBrand marca;
	private Integer ano; 
	private String descricao; 
	private Boolean vendido; 
	private Date created; 
	private Date updated;
	
	public VehiclesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VehiclesDTO(Vehicles obj) {
		super();
		this.id = obj.getId();
		this.veiculo = obj.getVeiculo();
		this.marca = obj.getMarca();
		this.ano = obj.getAno();
		this.vendido = obj.isVendido();
		this.descricao = obj.getDescricao();
		this.created = obj.getCreated();
		this.updated = obj.getUpdated();
	}




	
	
}
