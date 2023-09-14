package com.salinas.mx.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_combustibles")
public class TipoCombustible {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo_combustible")
	private Integer idCombustible;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "activo")
	private Boolean activo;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	public TipoCombustible() {

	}

	public TipoCombustible(Integer idCombustible, String nombre, String descripcion, Boolean activo,
			Date fechaCreacion) {
		this.idCombustible = idCombustible;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdCombustible() {
		return idCombustible;
	}

	public void setIdCombustible(Integer idCombustible) {
		this.idCombustible = idCombustible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "TipoCombustible [idCombustible=" + idCombustible + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", activo=" + activo + ", fechaCreacion=" + fechaCreacion + "]\n";
	}

}
