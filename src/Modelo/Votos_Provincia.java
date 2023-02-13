package Modelo;

public class Votos_Provincia {
	
	String NombreCantante;
	int numeroVotos;
	
	public Votos_Provincia (String NombreCantante) {
		this.NombreCantante = NombreCantante;
		this.numeroVotos = 0;
	}
	
	public void setVotos() {
		this.numeroVotos++;
	}
	
	public void editarVotos(int numero) {
		this.numeroVotos = numero;
	}
	
	public void editarNombre(String nombre) {
		this.NombreCantante = nombre;
	}
	
	public int getVotos() {
		return numeroVotos;
	}
	
	public String getNombre() {
		return NombreCantante;
	}

}
