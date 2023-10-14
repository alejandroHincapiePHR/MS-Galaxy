package com.ms.negocio.gestionclientes.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTO")
@Entity(name = "ProductoEntity")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteEntity {

	@Id
	@Column(name = "ID_PRODUCTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=5,max=240, message="El nombre debe tener como mínimo {min} y máximo {max} caracteres")
	@Column(name = "nombre",length=240,nullable=false)
	private String nombre;
	
	@Column(name = "precio")
	private Double precio;

	@Column(name = "stock_minimo")
	private Integer stockMinimo;
	
	@Column(name = "stock_maximo")
	private Integer stockMaximo;
	
	@Column(name = "ESTADO")
	private String estado;

}

