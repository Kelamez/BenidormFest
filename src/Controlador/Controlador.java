package Controlador;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import Modelo.Cantante;
import Vista.Vista;

public class Controlador implements ActionListener{
	
	Vista vista = new Vista();
	ArrayList<Cantante> cantantes = new ArrayList<Cantante>();
	DefaultListModel modelo = new DefaultListModel();
	int numero;
	
	public Controlador(Vista vista) {
		this.vista = vista;
		
		this.vista.Siguiente.addActionListener(this);
		this.vista.Anterior.addActionListener(this);
		this.vista.VerCantantes.addActionListener(this);
		this.vista.Volver1.addActionListener(this);
		this.vista.VerProvincias.addActionListener(this);
		this.vista.Volver2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == vista.VerCantantes) {
			this.vista.CantantesPane.setVisible(true);
			this.vista.PrimerPane.setVisible(false);
		}
		
		if (e.getSource() == vista.Siguiente) {
			this.vista.Foto1.setIcon(new ImageIcon(Vista.class.getResource("/img/Nahid.png")));
			this.vista.Foto2.setIcon(new ImageIcon(Vista.class.getResource("/img/Julio.png")));
			this.vista.Foto3.setIcon(new ImageIcon(Vista.class.getResource("/img/Sarah.png")));
			this.vista.Foto4.setIcon(new ImageIcon(Vista.class.getResource("/img/Thiago.png")));
			this.vista.Foto5.setIcon(new ImageIcon(Vista.class.getResource("/img/Victoria.png")));
			this.vista.Siguiente.setVisible(false);
			this.vista.Anterior.setVisible(true);
		}
		
		if (e.getSource() == vista.Anterior) {
			this.vista.Foto1.setIcon(new ImageIcon(Vista.class.getResource("/img/Alba.png")));
			this.vista.Foto2.setIcon(new ImageIcon(Vista.class.getResource("/img/Amie.png")));
			this.vista.Foto3.setIcon(new ImageIcon(Vista.class.getResource("/img/Elton.png")));
			this.vista.Foto4.setIcon(new ImageIcon(Vista.class.getResource("/img/Joel.png")));
			this.vista.Foto5.setIcon(new ImageIcon(Vista.class.getResource("/img/Marc.png")));
			this.vista.Siguiente.setVisible(true);
			this.vista.Anterior.setVisible(false);
		}
		
		if (e.getSource() == vista.Volver1) {
			this.vista.CantantesPane.setVisible(false);
			this.vista.PrimerPane.setVisible(true);
		}
		
		if (e.getSource() == vista.VerProvincias) {
			this.vista.PrimerPane.setVisible(false);
			this.vista.ProvinciasPane.setVisible(true);
		}
		
		if (e.getSource() == vista.Volver2) {
			this.vista.PrimerPane.setVisible(true);
			this.vista.ProvinciasPane.setVisible(false);
		}
		
	}

}
