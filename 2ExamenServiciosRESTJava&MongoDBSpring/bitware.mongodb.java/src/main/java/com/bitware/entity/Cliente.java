package com.bitware.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class Cliente implements Serializable {
	
	@Id
    private String id;
    private String Nombre_Usuario;
    private String Contraseña;
    private String Nombre;
    private String Apellidos;
    private String Correo_Electronico;
    private int Edad;
    private double Estatura;
    private double Peso;
    private double IMC;
    private double GEB;
    private double ETA;
    private Date Fecha_Creacion;
    private Date Fecha_Actualizacion;
    private static final long serialVersionUID = 3689913466877039166L;
    
    
    
	public Cliente() {
		
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}
	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}
	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public double getEstatura() {
		return Estatura;
	}
	public void setEstatura(double estatura) {
		Estatura = estatura;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getIMC() {
		return IMC;
	}
	public void setIMC(double iMC) {
		IMC = iMC;
	}
	public double getGEB() {
		return GEB;
	}
	public void setGEB(double gEB) {
		GEB = gEB;
	}
	public double getETA() {
		return ETA;
	}
	public void setETA(double eTA) {
		ETA = eTA;
	}
	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}
	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	public Date getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}
	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}
	@Override
	public String toString() {
		return "Cliente [Cliente_ID=" + id + ", Nombre_Usuario=" + Nombre_Usuario + ", Contraseña=" + Contraseña
				+ ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Correo_Electronico=" + Correo_Electronico
				+ ", Edad=" + Edad + ", Estatura=" + Estatura + ", Peso=" + Peso + ", IMC=" + IMC + ", GEB=" + GEB
				+ ", ETA=" + ETA + ", Fecha_Creacion=" + Fecha_Creacion + ", Fecha_Actualizacion=" + Fecha_Actualizacion
				+ "]";
	}
    
    

	
	

}
