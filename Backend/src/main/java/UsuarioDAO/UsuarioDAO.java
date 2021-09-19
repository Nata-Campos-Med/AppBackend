package UsuarioDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conexion;
import modelo.UsuarioDTO;
import util.Constantes;

public class UsuarioDAO {

	Conexion con = new Conexion();

	public boolean buscar(String cedula) {
		String sentencia = String.format(Constantes.CONSULTAR, cedula);
		if (con.ejecutarSentenciaSQL(sentencia)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean crear(UsuarioDTO usDTO) {
		if (!buscar(usDTO.getCedula())) {
			String sentencia = String.format(Constantes.CREAR, usDTO.getCedula(), usDTO.getEmail(), usDTO.getNombre(),
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

	public ResultSet consultar(String cedula) {
		if (buscar(cedula)) {
			String sentencia = String.format(Constantes.CONSULTAR, cedula);
			return con.consultarRegistros(sentencia);
		} else {
			return null;
		}
	}

	public boolean actualizar(String cedula, UsuarioDTO usDTO) {
		if (buscar(cedula)) {
			String sentencia = String.format(Constantes.ACTUALIZAR, usDTO.getEmail(), usDTO.getNombre(),
					usDTO.getUser(), usDTO.getPassword(), cedula);
			con.ejecutarSentenciaSQL(sentencia);
			return true;
		} else {
			return false;
		}
	}

	public boolean eliminar(String cedula) {
		if (buscar(cedula)) {
			String sentencia = String.format(Constantes.ELIMINAR, cedula);
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
