package Modelo;

import java.util.ArrayList;

public class Provincia {
	
	String Nombre;
	int Habitantes;
	int rango_1_9;
	int rango_10_17;
	int rango_18_25;
	int rango_26_40;
	int rango_41_65;
	int rango_mas_66;
	
	public Provincia () {
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getHabitantes() {
		return Habitantes;
	}

	public void setHabitantes(int habitantes) {
		Habitantes = habitantes;
	}

	public int getRango_1_9() {
		return rango_1_9;
	}

	public void setRango_1_9(int rango_1_9) {
		this.rango_1_9 = rango_1_9;
	}

	public int getRango_10_17() {
		return rango_10_17;
	}

	public void setRango_10_17(int rango_10_17) {
		this.rango_10_17 = rango_10_17;
	}

	public int getRango_18_25() {
		return rango_18_25;
	}

	public void setRango_18_25(int rango_18_25) {
		this.rango_18_25 = rango_18_25;
	}

	public int getRango_26_40() {
		return rango_26_40;
	}

	public void setRango_26_40(int rango_26_40) {
		this.rango_26_40 = rango_26_40;
	}

	public int getRango_41_65() {
		return rango_41_65;
	}

	public void setRango_41_65(int rango_41_65) {
		this.rango_41_65 = rango_41_65;
	}

	public int getRango_mas_66() {
		return rango_mas_66;
	}

	public void setRango_mas_66(int rango_mas_66) {
		this.rango_mas_66 = rango_mas_66;
	}

}
