package com.arambalacarajo.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "proveedores")
public class Proveedores {

	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", parameters = @Parameter(name = "prefix", value = "P"), strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "cod_proveedor")
	private String codProveedor;

	@Column(name = "razon_social", nullable = false)
	private String razonSocial;

	@Column(name = "nit", nullable = false)
	private char[] nit;

	@Column(name = "telefono", nullable = false)
	private char[] telefono;

	@Column(name = "direccion", nullable = false)
	private String direccion;

	@Column(name = "correo")
	private String correo;

	@Column(name = "activo", nullable = false)
	private boolean activo = true;

	@Column(name = "creado", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	@CreatedDate
	private LocalDate creado;

	@Column(name = "actualizado", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	@LastModifiedDate
	private LocalDate actualizado;

	@Column(name = "eliminado")
	private LocalDate eliminado;

	public Proveedores() {
	}

	public Proveedores(String codProveedor, String razonSocial, char[] nit, char[] telefono, String direccion,
			String correo, boolean activo, LocalDate creado, LocalDate actualizado, LocalDate eliminado) {
		this.codProveedor = codProveedor;
		this.razonSocial = razonSocial;
		this.nit = nit;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public String getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(String codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public char[] getNit() {
		return nit;
	}

	public void setNit(char[] nit) {
		this.nit = nit;
	}

	public char[] getTelefono() {
		return telefono;
	}

	public void setTelefono(char[] telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getCreado() {
		return creado;
	}

	public void setCreado(LocalDate creado) {
		this.creado = creado;
	}

	public LocalDate getActualizado() {
		return actualizado;
	}

	public void setActualizado(LocalDate actualizado) {
		this.actualizado = actualizado;
	}

	public LocalDate getEliminado() {
		return eliminado;
	}

	public void setEliminado(LocalDate eliminado) {
		this.eliminado = eliminado;
	}

}
