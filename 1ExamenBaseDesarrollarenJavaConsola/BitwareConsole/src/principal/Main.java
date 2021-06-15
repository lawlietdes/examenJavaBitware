package principal;

import java.util.Locale;
import java.util.Scanner;

import controller.CalcularPersona;
import objetos.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona  persona = mensajesPorConsola();
		CalcularPersona cpersona = new CalcularPersona(persona);
		
		System.out.println();
		System.out.println("Tus resultados");
		System.out.println();
		
		System.out.println(pesoIdeal(cpersona.calcularIMC()));
		System.out.println(mayorDeEdad(persona.getEdad()));
		System.out.println(persona);

	}
	
	public static Persona mensajesPorConsola() {
		 Scanner leerConsola = new Scanner (System.in).useLocale(Locale.US);; 
		 String nombre = "";
		 int edad = 0 ;
		 char sexo = 'H';
		 double peso  = 0;
		 double altura = 0;
		 
		 System.out.println("Escribe tu nombre");
		 nombre = leerConsola.nextLine();
		 
		 System.out.println("Escribe tu edad");
		 edad = leerConsola.nextInt();
		 
		 System.out.println("Escribe tu sexo con una letra H (Hombre) / M (Mujer) ");
		 sexo = leerConsola.next().charAt(0);
		 
		 System.out.println("Escribe tu peso en kg");
		 peso = leerConsola.nextDouble();
		 
		 System.out.println("Escribe tu altura en metros");
		 altura = leerConsola.nextDouble();
		 
		 String nSS = gerneraNSS();
		 Persona persona = new Persona(nombre, edad, nSS, sexo, peso, altura);
		 
		 return persona;
		
	}
	
	public static String pesoIdeal(double imc) {
		String respuesta = "";
		if(imc == -1) {
			respuesta = "Estas en un peso bajo";
		}
		if(imc == 0) {
			respuesta = "Estas en tu peso ideal";
		}
		if(imc == 1) {
			respuesta = "Tienes sobrepeso";
		}
		
		
		return respuesta;
	}
	
	public static String mayorDeEdad(int edad) {
		String respuesta = "";
		if(edad >= 18) {
			respuesta = "Eres mayor de edad";
		}else {
			respuesta = "Eres menor de edad";
		}
		
		return respuesta;
	}
	
	public static String gerneraNSS() {
		 int randomValue = 0;
		 int getRandomValue2 = 0;
		 String nss = "";
		 
		 for (int i = 0; i < 8; i++) {
			 randomValue = (int) (Math.random()*(4-1)) + 1;
			 if(randomValue == 1) {
				 nss +=  (char)(Math.random()*26 + 'A');
			 }else if(randomValue == 2) {
				 nss +=  (char)(Math.random()*26 + 'a');
			 }else {
				 getRandomValue2 = (int) (Math.random()*(9-1)) + 1;
				 nss += String.valueOf(getRandomValue2);
			 }
		}
		 
		return nss;
	}
	
	

}
