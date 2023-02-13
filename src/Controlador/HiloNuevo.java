package Controlador;

import java.util.ArrayList;
import java.util.List;

import Modelo.Cantante;
import Modelo.Porcentaje_votacion_rango;
import Modelo.Provincia;
import Modelo.Votos_Provincia;

public class HiloNuevo {

	Provincia pro;
	private List<Porcentaje_votacion_rango> porcen;
	private List<Cantante> cantantes;
	private List<Votos_Provincia> mejores;
	private List<Cantante> mejorescantantes;
	double votantes_18_25;
	double votantes_26_40;
	double votantes_41_65;
	double votantes_mas_66;
	
	public HiloNuevo(Provincia pro, List<Porcentaje_votacion_rango> porcen, List<Cantante> cantantes) {
		this.pro = pro;
		this.porcen = porcen;
		this.cantantes = cantantes;
		this.mejores = new ArrayList<Votos_Provincia>();
		this.mejorescantantes = new ArrayList<Cantante>();
		this.votantes_18_25 = pro.getHabitantes() * pro.getRango_18_25() /100 * porcen.get(2).getPorcentaje() /100;
		this.votantes_26_40 = pro.getHabitantes() * pro.getRango_26_40() /100 * porcen.get(3).getPorcentaje() /100;
		this.votantes_41_65 = pro.getHabitantes() * pro.getRango_41_65() /100 * porcen.get(4).getPorcentaje() /100;
		this.votantes_mas_66 = pro.getHabitantes() * pro.getRango_mas_66() /100 * porcen.get(5).getPorcentaje() /100;
	}
	
	public void crearVotos(){
		int votosjovenes = (int) (votantes_18_25);
		int votosadultos = (int) (votantes_26_40);
		int votosancianos = (int) (votantes_41_65);
		int votosjubilados = (int) (votantes_mas_66);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Iniciada votación de la provincia " + pro.getNombre());
		System.out.println("-------------------------------------------------------------");
		
		for (int i = 0; i < votosjovenes; i++) {
			Hilo hilojovenes = new Hilo(0, cantantes, pro.getConteovotos());
			
			try {
				hilojovenes.start();
				
				hilojovenes.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < votosadultos; i++) {
			Hilo hiloadultos = new Hilo(1, cantantes, pro.getConteovotos());
			
			try {
				hiloadultos.start();
				
				hiloadultos.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < votosancianos; i++) {
			Hilo hiloancianos = new Hilo(2, cantantes, pro.getConteovotos());
			
			try {
				hiloancianos.start();
				
				hiloancianos.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < votosjubilados; i++) {
			Hilo hilojubilados = new Hilo(3, cantantes, pro.getConteovotos());
			
			try {
				hilojubilados.start();
				
				hilojubilados.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		adular();
	}
	
	public void adular() {
		mejores.add(new Votos_Provincia("primero"));
		mejores.add(new Votos_Provincia("segundo"));
		mejores.add(new Votos_Provincia("tercero"));
		
		List<Votos_Provincia> votos = pro.getConteovotos();
		
		for (int i = 0; i < votos.size(); i++) {
			if (votos.get(i).getVotos() > mejores.get(0).getVotos()) {
				mejores.get(2).editarNombre(mejores.get(1).getNombre());
				mejores.get(2).editarVotos(mejores.get(1).getVotos());
				mejores.get(1).editarNombre(mejores.get(0).getNombre());
				mejores.get(1).editarVotos(mejores.get(0).getVotos());
				mejores.get(0).editarNombre(votos.get(i).getNombre());
				mejores.get(0).editarVotos(votos.get(i).getVotos());
			} else if (votos.get(i).getVotos() > mejores.get(1).getVotos()) {
				mejores.get(2).editarNombre(mejores.get(1).getNombre());
				mejores.get(2).editarVotos(mejores.get(1).getVotos());
				mejores.get(1).editarNombre(votos.get(i).getNombre());
				mejores.get(1).editarVotos(votos.get(i).getVotos());
			}else if (votos.get(i).getVotos() > mejores.get(2).getVotos()) {
				mejores.get(2).editarNombre(votos.get(i).getNombre());
				mejores.get(2).editarVotos(votos.get(i).getVotos());
			}
		}
		
		for (int i = 0; i < cantantes.size(); i++) {
			if (cantantes.get(i).getNombre().equals(mejores.get(0).getNombre())) {
				cantantes.get(i).adular(15);
				mejorescantantes.add(cantantes.get(i));
			}
		}
		
		for (int j = 0; j < cantantes.size(); j++) {
			if (cantantes.get(j).getNombre().equals(mejores.get(1).getNombre())) {
				cantantes.get(j).adular(10);
				mejorescantantes.add(cantantes.get(j));
			}
		}
		
		for (int l = 0; l < cantantes.size(); l++) {
			if (cantantes.get(l).getNombre().equals(mejores.get(2).getNombre())) {
				cantantes.get(l).adular(8);
				mejorescantantes.add(cantantes.get(l));
			}
		}
		
		pro.setMejorescantantes(mejorescantantes);
	}
	
}
