package controller;

import objetos.Persona;

public class CalcularPersona {
	private Persona persona;
	
	public CalcularPersona() {
		
	}

	public CalcularPersona(Persona persona) {
		this.persona = persona;
	}
	
	public int calcularIMC(){
		double iMC = (this.persona.getPeso()) / (this.persona.getAltura()*this.persona.getAltura());
		int resp = 0;
		
		if(this.persona.getSexo() == 'H') {
			
			if(iMC < 20) {
				resp = -1;
				
			}else if( iMC >= 20 && iMC <= 25) {
				resp = 0;
				
			}else if(iMC > 25) {
				resp = 1;
				
			}
			
		}else if(this.persona.getSexo() == 'M'){
			
			if(iMC < 19) {
				resp = -1;
				
			}else if( iMC >= 19 && iMC <= 24) {
				resp = 0;
				
			}else if(iMC > 24) {
				resp = 1;
				
			}
			
		}
		
		return resp;
	}
	
	public boolean esMayorDeEdad() {
		
		return this.persona.getEdad() < 18 ? true : false;
		
	}
	
	public boolean comprobarSexo(char sexo){
		
		return (sexo == 'H' || sexo == 'M') ? true: false;
	}
	
	
	

}
