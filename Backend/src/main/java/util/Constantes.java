package util;

public class Constantes {

	public final static String URL = "jdbc:mysql://localhost:3306/Papeleriawww";
	public final static String USUARIO = "root";
	public final static String CONTRASENHA = "leobor91";
	public final static String CREAR = "INSERT INTO usuarios (cedula_usuario, email_usuario, nombre_usuario, usuario, password) VALUES ('%S', '%S', '%S', '%S', '%S',)";
	public final static String CONSULTAR = "SELECT * FROM USUARIOS WHERE cedula_usuario = '%S'";
	public final static String ELIMINAR = "DELETE FROM USUARIOS WHERE cedula_usuario = '%S'";
	public final static String ACTUALIZAR = "UPDATE usuarios SET email_usuario = '%s', nombre_usuario = '%s', usuario = '%s', password = '%s' WHERE cedula_usuario = '%s'";

}
