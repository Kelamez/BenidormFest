package Modelo;

public class Cantante {
	
	String Nombre;
	int Puntuacion;
	String Foto;

	public Cantante (String Nombre) {
		this.Nombre = Nombre;
		this.Foto = "/img/" + Nombre + ".png";
		Puntuacion = 0;
	}

	public String getNombre() {
		return Nombre;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		Puntuacion =+ puntuacion;
	}

	public String getFoto() {
		return Foto;
	}
}
