package Modelo;

public class Cantante {
	
	private String Nombre;
	private int Puntuacion;
	private String Foto;
	private int jovenes;
	private int adultos;
	private int ancianos;
	private int jubilados;

	public Cantante (String Nombre) {
		this.Nombre = Nombre;
		this.Foto = "/img/" + Nombre + ".png";
		this.Puntuacion = 0;
		this.jovenes = 0;
		this.adultos = 0;
		this.ancianos = 0;
		this.jubilados = 0;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion() {
		this.Puntuacion += jovenes + adultos + ancianos + jubilados;
	}

	public String getFoto() {
		return Foto;
	}

	public int getJovenes() {
		return jovenes;
	}

	public void setJovenes() {
		this.jovenes++;
	}

	public int getAdultos() {
		return adultos;
	}

	public void setAdultos() {
		this.adultos++;
	}

	public int getAncianos() {
		return ancianos;
	}

	public void setAncianos() {
		this.ancianos++;
	}

	public int getJubilados() {
		return jubilados;
	}

	public void setJubilados() {
		this.jubilados++;
	}
	
	public void adular(int numero) {
		this.Puntuacion += numero;
	}
}
