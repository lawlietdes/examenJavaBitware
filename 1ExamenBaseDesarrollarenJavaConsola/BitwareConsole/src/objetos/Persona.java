package objetos;

public class Persona {
	
	private String nombre; 
	private int edad;
	private String NSS;
	private char sexo;
	//private final char sexo;
	private double peso;
	private double altura;
	
	public Persona(String nombre, int edad, String nSS, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.NSS = nSS;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;

	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNSS() {
		return NSS;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", NSS=" + NSS + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	

}
