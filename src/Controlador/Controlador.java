package Controlador;

import java.awt.event.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import Modelo.Cantante;
import Modelo.Porcentaje_votacion_rango;
import Modelo.Provincia;
import Vista.Vista;

public class Controlador implements ActionListener{
	
	Vista vista = new Vista();
	List<Cantante> cantantes = null;
	List<Provincia> provincias = null;
	List<Porcentaje_votacion_rango> porcentaje_votacion_rango = null;
	Connection conexion = null;
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
		this.vista.IniciarVotacion.addActionListener(this);
		this.vista.VerGanadores.addActionListener(this);
		
		try {
			conexion = createConnection();
			System.out.println("Conexión realizada.");
			
			provincias = getProvincias(conexion);
			
			System.out.println(provincias);
			
			porcentaje_votacion_rango = getPorcentajes(conexion);
			
			System.out.println(porcentaje_votacion_rango);
			
			cantantes = getCantantes(conexion);
			
			System.out.println(cantantes);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
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
		
		if (e.getSource() == vista.IniciarVotacion) {
			this.vista.IniciarVotacion.setVisible(false);
			this.vista.VerGanadores.setVisible(true);
			this.vista.primero.setVisible(true);
			this.vista.first.setVisible(true);
			this.vista.segundo.setVisible(true);
			this.vista.second.setVisible(true);
			this.vista.tercero.setVisible(true);
			this.vista.third.setVisible(true);
		}
		
		if (e.getSource() == vista.VerGanadores) {
			
		}
		
	}
	
	public Connection createConnection() throws ClassNotFoundException, SQLException, IOException {

		Connection connection = null;
		FileReader fileReader = null;
			try {
				Properties propiedades = new Properties();
				fileReader = new FileReader("src/resources/database.properties");
				propiedades.load(fileReader);
				String driver = propiedades.getProperty("database.driver");
				String url = propiedades.getProperty("database.url");
				String user = propiedades.getProperty("database.user");
				String password = propiedades.getProperty("database.password");

				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);

				connection.setAutoCommit(false);
				
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
				throw e;
			} finally {
				if (null != fileReader) {
					fileReader.close();
				}
			}
			return connection;
	}
	
	public List<Cantante> getCantantes(Connection connection) throws SQLException {
		List<Cantante> cantantes = new ArrayList<Cantante>();
		
		String consultaSQL = "SELECT * " + 
					" FROM CANTANTES";
	
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			preparedStatement = connection.prepareStatement(consultaSQL);
			resultSet = preparedStatement.executeQuery();
			
			Cantante cantante;
			
			while (resultSet.next()) {
				cantante = new Cantante(resultSet.getString("NOMBRE"));
				
				cantantes.add(cantante);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	return cantantes;
	}
	
	public List<Porcentaje_votacion_rango> getPorcentajes(Connection connection) throws SQLException {
		List<Porcentaje_votacion_rango> porcentaje_votacion_rango_lista = new ArrayList<Porcentaje_votacion_rango>();
		
		String consultaSQL = "SELECT * " + 
					" FROM PORCENTAJE_VOTACION_RANGO";
	
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			preparedStatement = connection.prepareStatement(consultaSQL);
			resultSet = preparedStatement.executeQuery();
			
			Porcentaje_votacion_rango porcentaje_votacion_rango;
			
			while (resultSet.next()) {
				porcentaje_votacion_rango = new Porcentaje_votacion_rango(resultSet.getString("RANGO"), resultSet.getInt("PORCENTAJE"));
				
				porcentaje_votacion_rango_lista.add(porcentaje_votacion_rango);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != preparedStatement) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	return porcentaje_votacion_rango_lista;
	}
	
	public List<Provincia> getProvincias(Connection connection) throws SQLException {
		
		List<Provincia> listaProvincias = new ArrayList<Provincia>();
		
			String consultaSQL = "SELECT * " + 
						" FROM PORCENTAJES_RANGOEDAD";
		
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
		
			try {
				
				preparedStatement = connection.prepareStatement(consultaSQL);
				resultSet = preparedStatement.executeQuery();
				
				Provincia provincia;
				while (resultSet.next()) {
					provincia = new Provincia();
					provincia.setNombre(resultSet.getString("NOMBRE_COMUNIDAD"));
					provincia.setHabitantes(resultSet.getInt("TOTAL_HABITANTES"));
					provincia.setRango_1_9(resultSet.getInt("RANGO_1_9"));
					provincia.setRango_10_17(resultSet.getInt("RANGO_10_17"));
					provincia.setRango_18_25(resultSet.getInt("RANGO_18_25"));
					provincia.setRango_26_40(resultSet.getInt("RANGO_26_40"));
					provincia.setRango_41_65(resultSet.getInt("RANGO_41_65"));
					provincia.setRango_mas_66(resultSet.getInt("RANGO_MAS_66"));
					
					listaProvincias.add(provincia);
				}

			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			} finally {
				if (null != resultSet) {
					try {
						resultSet.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (null != preparedStatement) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		return listaProvincias;
	}
}
