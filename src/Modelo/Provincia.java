package Modelo;

import java.util.ArrayList;

public class Provincia {
	
	String Nombre;
	ArrayList<Votante> Votantes = new ArrayList<Votante>();
	
	public Provincia (String Nombre, ArrayList<Votante> Votantes) {
		this.Nombre = Nombre;
		this.Votantes = Votantes;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public ArrayList<Votante> getVotantes() {
		return Votantes;
	}

	public void setVotantes(ArrayList<Votante> votantes) {
		Votantes = votantes;
	}

}
