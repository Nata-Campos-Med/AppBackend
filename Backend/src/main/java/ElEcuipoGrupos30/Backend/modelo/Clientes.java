package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	 private long cedula_cliente;// igual al de la base de datos
	 private String direccion_cliente;
	 private String email_cliente;
	 private String nombre_cliente;
	 private String telefono_cliente;
	public long getCedula_clientes() {
		return cedula_cliente;
	}
	public void setCedula_clientes(long cedula_clientes) {
		this.cedula_cliente = cedula_clientes;
	}
	public String getDireccion_cliente() {
		return direccion_cliente;
	}
	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
	public String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	 
	 

}
