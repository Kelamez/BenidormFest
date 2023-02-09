package Modelo;

public class Porcentaje_votacion_rango {
	
	String rango;
	int porcentaje;
	
	public Porcentaje_votacion_rango(String rango, int porcentaje) {
		this.rango = rango;
		this.porcentaje = porcentaje;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

}
