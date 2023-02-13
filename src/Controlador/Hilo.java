package Controlador;

import java.util.List;

import Modelo.Cantante;
import Modelo.Provincia;
import Modelo.Votos_Provincia;

public class Hilo extends Thread {
	
	private int rango;
	private List<Cantante> cantantes;
	 List<Votos_Provincia> pro;

	public Hilo(int rango, List<Cantante> cantantes, List<Votos_Provincia> pro) {
		this.rango = rango;
		this.cantantes = cantantes;
		this.pro = pro;
	}
	
	//para rangos entre 1 y 25
		private void votosjovenes() {
			int numaleatorio = (int) (Math.random()*101);
			if(numaleatorio < 8) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Joel")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Joel")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 8 && numaleatorio < 11) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Victoria")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Victoria")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 11 && numaleatorio < 24) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Thiago")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Thiago")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 24 && numaleatorio < 31) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Sarah")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Sarah")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 31 && numaleatorio < 38) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Elton")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Elton")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 38 && numaleatorio < 52) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Amie")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Amie")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 52 && numaleatorio < 62) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Nahid")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Nahid")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 62 && numaleatorio < 89) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Marc")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Marc")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 89 && numaleatorio < 96) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Alba")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Alba")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 96) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Julio")) {
						cantantes.get(i).setJovenes();
					}
					if (pro.get(i).getNombre().equals("Julio")) {
						pro.get(i).setVotos();
					}
				}
			}
		}
		
		//para rangos entre 26 y 40
		private void votosadultos() {
			int numaleatorio = (int) (Math.random()*101);
			if(numaleatorio < 15) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Joel")) {
						cantantes.get(i).setAdultos();
						if (pro.get(i).getNombre().equals("Joel")) {
							pro.get(i).setVotos();
						}
					}
				}
			}else if(numaleatorio >= 15 && numaleatorio < 21) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Victoria")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Victoria")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 21 && numaleatorio < 34) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Thiago")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Thiago")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 34 && numaleatorio < 41) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Sarah")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Sarah")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 41 && numaleatorio < 47) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Elton")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Elton")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 47 && numaleatorio < 59) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Amie")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Amie")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 59 && numaleatorio < 66) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Nahid")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Nahid")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 66 && numaleatorio < 82) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Marc")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Marc")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 82 && numaleatorio < 91) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Alba")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Alba")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 91) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Julio")) {
						cantantes.get(i).setAdultos();
					}
					if (pro.get(i).getNombre().equals("Julio")) {
						pro.get(i).setVotos();
					}
				}
			}
		}
		
		//para rangos entre 51 y 65
		private void votosancianos() {
			int numaleatorio = (int) (Math.random()*101);
			if(numaleatorio < 6) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Joel")) {
						cantantes.get(i).setAncianos();
						if (pro.get(i).getNombre().equals("Joel")) {
							pro.get(i).setVotos();
						}
					}
				}
			}else if(numaleatorio >= 6 && numaleatorio < 16) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Victoria")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Victoria")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 16 && numaleatorio < 28) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Thiago")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Thiago")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 28 && numaleatorio < 34) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Sarah")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Sarah")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 34 && numaleatorio < 41) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Elton")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Elton")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 41 && numaleatorio < 55) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Amie")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Amie")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 55 && numaleatorio < 62) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Nahid")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Nahid")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 62 && numaleatorio < 72) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Marc")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Marc")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 72 && numaleatorio < 89) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Alba")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Alba")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 89) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Julio")) {
						cantantes.get(i).setAncianos();
					}
					if (pro.get(i).getNombre().equals("Julio")) {
						pro.get(i).setVotos();
					}
				}
			}
		}
		
		//para rangos mas de 65
		private void votosjubilados() {
			int numaleatorio = (int) (Math.random()*101);
			if(numaleatorio < 4) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Joel")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Joel")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 4 && numaleatorio < 21) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Victoria")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Victoria")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 21 && numaleatorio < 26) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Thiago")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Thiago")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 26 && numaleatorio < 38) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Sarah")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Sarah")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 38 && numaleatorio < 50) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Elton")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Elton")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 50 && numaleatorio < 59) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Amie")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Amie")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 59 && numaleatorio < 66) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Nahid")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Nahid")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 66 && numaleatorio < 77) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Marc")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Marc")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 77 && numaleatorio < 92) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Alba")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Alba")) {
						pro.get(i).setVotos();
					}
				}
			}else if(numaleatorio >= 92) {
				for (int i = 0; i < cantantes.size(); i++) {
					if (cantantes.get(i).getNombre().equals("Julio")) {
						cantantes.get(i).setJubilados();
					}
					if (pro.get(i).getNombre().equals("Julio")) {
						pro.get(i).setVotos();
					}
				}
			}
		}
	
	@Override
	public void run() {
		try {
			if (rango == 0) {
				votosjovenes();
				System.out.println("Voto joven emitido");
			} else if (rango == 1) {
				votosadultos();
				System.out.println("Voto adulto emitido");
			} else if (rango == 2) {
				votosancianos();
				System.out.println("Voto anciano emitido");
			} else if (rango == 3) {
				votosjubilados();
				System.out.println("Voto jubilado emitido");
			}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
