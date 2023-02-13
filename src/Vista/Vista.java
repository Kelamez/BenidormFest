package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	public JPanel PrincipalPane, CantantesPane, PrimerPane, ProvinciasPane;
	public JButton VerProvincias, VerCantantes, IniciarVotacion, VerGanadores, Siguiente, Anterior, Volver1, Volver2, Confirmacion;
	public JLabel fondo, first, second, third, primero, segundo, tercero, Foto1, Foto2, Foto3, Foto4, Foto5, fondoCantante, fondoProvincias, tabla, fondoGanadores;
	public JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					Controlador controlador = new Controlador(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 578);
		
		PrincipalPane = new JPanel();
		PrincipalPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PrincipalPane);
		PrincipalPane.setLayout(null);
		PrincipalPane.setLayout(null);
		
		PrimerPane = new JPanel();
		PrimerPane.setBounds(0, 0, 747, 539);
		PrincipalPane.add(PrimerPane);
		PrimerPane.setLayout(null);
		
		VerCantantes = new JButton("Ver Cantantes");
		VerCantantes.setForeground(new Color(251, 2, 2));
		VerCantantes.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		VerCantantes.setBackground(new Color(0, 0, 85));
		VerCantantes.setBounds(266, 11, 215, 50);
		PrimerPane.add(VerCantantes);
		
		VerProvincias = new JButton("Ver Provincias");
		VerProvincias.setForeground(new Color(251, 2, 2));
		VerProvincias.setBackground(new Color(0, 0, 85));
		VerProvincias.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		VerProvincias.setBounds(24, 11, 215, 50);
		PrimerPane.add(VerProvincias);
		
		IniciarVotacion = new JButton("Iniciar Votaci\u00F3n");
		IniciarVotacion.setBackground(new Color(50, 205, 50));
		IniciarVotacion.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		IniciarVotacion.setBounds(506, 11, 215, 50);
		PrimerPane.add(IniciarVotacion);
		
		VerGanadores = new JButton("Felicidades");
		VerGanadores.setEnabled(false);
		VerGanadores.setBackground(new Color(236, 189, 0));
		VerGanadores.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		VerGanadores.setBounds(266, 487, 215, 50);
		PrimerPane.add(VerGanadores);
		VerGanadores.setVisible(false);
		
		Confirmacion = new JButton("Confirmar");
		Confirmacion.setForeground(new Color(32, 178, 170));
		Confirmacion.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		Confirmacion.setBackground(new Color(0, 0, 139));
		Confirmacion.setBounds(619, 63, 101, 37);
		PrimerPane.add(Confirmacion);
		Confirmacion.setVisible(false);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 63, 612, 37);
		PrimerPane.add(textField);
		textField.setVisible(false);
		
		first = new JLabel("");
		first.setHorizontalAlignment(SwingConstants.CENTER);
		first.setIcon(new ImageIcon(Vista.class.getResource("/img/primero.png")));
		first.setBounds(275, 410, 197, 66);
		PrimerPane.add(first);
		first.setVisible(false);
		
		second = new JLabel("");
		second.setHorizontalAlignment(SwingConstants.CENTER);
		second.setIcon(new ImageIcon(Vista.class.getResource("/img/segundo.png")));
		second.setBounds(511, 410, 197, 66);
		PrimerPane.add(second);
		second.setVisible(false);
		
		third = new JLabel("");
		third.setIcon(new ImageIcon(Vista.class.getResource("/img/tercero.png")));
		third.setHorizontalAlignment(SwingConstants.CENTER);
		third.setBounds(39, 410, 197, 66);
		PrimerPane.add(third);
		third.setVisible(false);
		
		primero = new JLabel("");
		primero.setHorizontalAlignment(SwingConstants.CENTER);
		primero.setBounds(275, 210, 197, 189);
		PrimerPane.add(primero);
		primero.setVisible(false);
		
		segundo = new JLabel("");
		segundo.setHorizontalAlignment(SwingConstants.CENTER);
		segundo.setBounds(511, 210, 197, 189);
		PrimerPane.add(segundo);
		segundo.setVisible(false);
		
		tercero = new JLabel("");
		tercero.setHorizontalAlignment(SwingConstants.CENTER);
		tercero.setBounds(39, 210, 197, 189);
		PrimerPane.add(tercero);
		tercero.setVisible(false);
		
		fondo = new JLabel("");
		fondo.setHorizontalAlignment(SwingConstants.TRAILING);
		fondo.setIcon(new ImageIcon(Vista.class.getResource("/img/fondo.png")));
		fondo.setBounds(0, 0, 747, 539);
		PrimerPane.add(fondo);
		
		//VER CANTANTES -------------------------------//
		
		CantantesPane = new JPanel();
		CantantesPane.setBounds(0, 0, 747, 539);
		PrincipalPane.add(CantantesPane);
		CantantesPane.setVisible(false);
		CantantesPane.setLayout(null);
		
		Siguiente = new JButton("Siguiente");
		Siguiente.setBackground(Color.LIGHT_GRAY);
		Siguiente.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		Siguiente.setBounds(266, 460, 215, 50);
		CantantesPane.add(Siguiente);
		
		Anterior = new JButton("Anterior");
		Anterior.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		Anterior.setBackground(Color.LIGHT_GRAY);
		Anterior.setBounds(266, 460, 215, 50);
		CantantesPane.add(Anterior);
		Anterior.setVisible(false);
		
		Foto1 = new JLabel("");
		Foto1.setBounds(275, 153, 197, 189);
		Foto1.setHorizontalAlignment(SwingConstants.CENTER);
		CantantesPane.add(Foto1);
		
		Foto2 = new JLabel("");
		Foto2.setBounds(517, 297, 197, 189);
		CantantesPane.add(Foto2);
		
		Foto3 = new JLabel("");
		Foto3.setBounds(517, 41, 197, 189);
		CantantesPane.add(Foto3);
		
		Foto4 = new JLabel("");
		Foto4.setBounds(39, 297, 197, 189);
		CantantesPane.add(Foto4);
		
		Foto5 = new JLabel("");
		Foto5.setBounds(41, 41, 197, 189);
		CantantesPane.add(Foto5);
		
		Foto1.setIcon(new ImageIcon(Vista.class.getResource("/img/Alba.png")));
		Foto2.setIcon(new ImageIcon(Vista.class.getResource("/img/Amie.png")));
		Foto3.setIcon(new ImageIcon(Vista.class.getResource("/img/Elton.png")));
		Foto4.setIcon(new ImageIcon(Vista.class.getResource("/img/Joel.png")));
		Foto5.setIcon(new ImageIcon(Vista.class.getResource("/img/Marc.png")));
		
		Volver1 = new JButton("Volver atras");
		Volver1.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		Volver1.setBackground(Color.LIGHT_GRAY);
		Volver1.setForeground(Color.BLACK);
		Volver1.setBounds(266, 25, 215, 50);
		CantantesPane.add(Volver1);
		
		fondoCantante = new JLabel("");
		fondoCantante.setHorizontalAlignment(SwingConstants.CENTER);
		fondoCantante.setBounds(0, 0, 747, 539);
		CantantesPane.add(fondoCantante);
		fondoCantante.setIcon(new ImageIcon(Vista.class.getResource("/img/fondoCantantes.png")));
		
		//VER PROVINCIAS -------------------------------//
		
		ProvinciasPane = new JPanel();
		ProvinciasPane.setBounds(0, 0, 747, 539);
		PrincipalPane.add(ProvinciasPane);
		ProvinciasPane.setLayout(null);
		ProvinciasPane.setVisible(false);
		
		Volver2 = new JButton("Volver");
		Volver2.setForeground(new Color(32, 178, 170));
		Volver2.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		Volver2.setBackground(new Color(0, 0, 139));
		Volver2.setBounds(266, 25, 215, 50);
		ProvinciasPane.add(Volver2);
		
		tabla = new JLabel("");
		tabla.setBounds(40, 80, 667, 439);
		ProvinciasPane.add(tabla);
		tabla.setIcon(new ImageIcon(Vista.class.getResource("/img/tabla.png")));
		
		fondoProvincias = new JLabel("");
		fondoProvincias.setHorizontalAlignment(SwingConstants.LEFT);
		fondoProvincias.setBounds(0, 0, 747, 539);
		ProvinciasPane.add(fondoProvincias);
		fondoProvincias.setIcon(new ImageIcon(Vista.class.getResource("/img/fondoProvincias.png")));
		
		fondoGanadores = new JLabel("");
		fondoGanadores.setHorizontalAlignment(SwingConstants.LEFT);
		fondoGanadores.setBounds(0, 0, 747, 539);
		ProvinciasPane.add(fondoGanadores);
		fondoGanadores.setIcon(new ImageIcon(Vista.class.getResource("/img/fondoProvincias.png")));
	}
}
