package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	@Column(name="cedula_cliente")
	 private long cedulaCliente;
	@Column(name="direccion_cliente")
	 private String direccionCliente;
	@Column(name="email_cliente")
	 private String emailCliente;
	@Column(name="nombre_cliente")
	 private String nombreCliente;
	@Column(name="telefono_cliente")
	 private String telefonoCliente;
	
	public long getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	
	 
}
