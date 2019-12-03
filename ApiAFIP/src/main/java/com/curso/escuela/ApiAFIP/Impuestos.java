package com.curso.escuela.ApiAFIP;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuestos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "impuesto")
	private String impuesto;
	@Column(name = "porcentaje")
	private String porcentaje;
	@Column(name = "fechadesde")
	private Date fechadesde;
	@Column(name = "fechahasta")
	private Date fechahasta;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public Date getFechadesde() {
		return fechadesde;
	}
	public void setFechadesde(Date fechadesde) {
		this.fechadesde = fechadesde;
	}
	public Date getFechahasta() {
		return fechahasta;
	}
	public void setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
	}

	
}
