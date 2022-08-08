package com.vehicles.api.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.vehicles.api.enums.VehicleBrand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "veiculo", nullable = false)
	private String veiculo; 
	
	@Column(name = "marca")
	@Enumerated(EnumType.STRING)
	private VehicleBrand marca;
	
	@Column(name = "ano")
	private int ano; 
	
	@Column(name = "descricao")
	private String descricao; 
	
	@Column(name = "vendido")
	private boolean vendido; 
	
	@CreatedDate
	@Column(name = "created")
	private Date created; 
	
    @LastModifiedDate
	@Column(name = "updated")
	private Date updated;

	
}
