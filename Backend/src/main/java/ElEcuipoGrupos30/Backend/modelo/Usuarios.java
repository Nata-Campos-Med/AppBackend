package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {

	@Id
	@Column(name = "cedula_usuario")
	private long cedulaUsuario;
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	@Column(name = "email_usuario")
	private String emailUsuario;
	private String usuario;
	private String password;
	
	public long getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
