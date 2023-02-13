package Modelo;

public class Porcentaje_votacion_rango {
	
	String rango;
	double porcentaje;
	
	public Porcentaje_votacion_rango(String rango, double porcentaje) {
		this.rango = rango;
		this.porcentaje = porcentaje;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

}
