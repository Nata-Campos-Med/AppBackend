package UsuarioDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conexion;
import modelo.UsuarioDTO;
import util.Constantes;

public class UsuarioDAO {

	Conexion con = new Conexion();

	public boolean buscar(String cedula, String consultas) {
		String sentencia = String.format(consultas, cedula);
		if (con.ejecutarSentenciaSQL(sentencia)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean crear(UsuarioDTO usDTO, String consultas, String crear) {
		if (!buscar(usDTO.getCedula(), consultas)) {
			String sentencia = String.format(crear, usDTO.getCedula(), usDTO.getEmail(), usDTO.getNombre(),
					usDTO.getUser(), usDTO.getPassword());
			con.ejecutarSentenciaSQL(sentencia);
			return true;
		} else {
			return false;
		}
	}

//    public void enviar(UsuarioDTO usDTO){
//        if (usDTO.getNombre().isEmpty() || usDTO.getCedula().isEmpty()){
//            System.out.println("faltan datos del usuario");
//        }else{
//            crear(usDTO);
//        }
//    }

	public ResultSet consultar(String cedula, String consultas) {
		if (buscar(cedula, consultas)) {
			String sentencia = String.format(consultas, cedula);
			return con.consultarRegistros(sentencia);
		} else {
			return null;
		}
	}

	public boolean actualizar(String cedula, UsuarioDTO usDTO, String consultas, String actualizar) {
		if (buscar(cedula, consultas)) {
			String sentencia = String.format(actualizar, usDTO.getEmail(), usDTO.getNombre(),
					usDTO.getUser(), usDTO.getPassword(), cedula);
			con.ejecutarSentenciaSQL(sentencia);
			return true;
		} else {
			return false;
		}
	}

	public boolean eliminar(String cedula, String consultas, String eliminar) {
		if (buscar(cedula, consultas)) {
			String sentencia = String.format(eliminar, cedula);
			con.ejecutarSentenciaSQL(sentencia);
			return true;
		} else {
			return false;
		}
	}

	/*public void mostrarUsuarios() {
		try {
			ResultSet resultado = con.consultarRegistros("SELECT * FROM USUARIOS");
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre_usuario"));
				System.out.println(resultado.getString("cedula_usuario"));
				System.out.println(resultado.getString("email_usuario"));
				System.out.println(resultado.getString("usuario"));
				System.out.println(resultado.getString("password"));
				System.out.println("");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}*/
}
