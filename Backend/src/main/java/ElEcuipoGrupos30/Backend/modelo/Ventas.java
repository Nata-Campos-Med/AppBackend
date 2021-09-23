package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	
	@Id
	@Column(name="codigo_venta")
	private long codigoVenta;
	@Column(name="cedula_cliente")
	private long cedulaCliente;
	@Column(name="cedula_usuario")
	private long cedulaUsuario;
	@Column(name="valor_venta")
	private double valorVenta;
	@Column(name="iva_venta")
	private double ivaVenta;
	@Column(name="total_venta")
	private double totalVenta;
	
	public long getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public long getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public long getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
	public double getIvaVenta() {
		return ivaVenta;
	}
	public void setIvaVenta(double ivaVenta) {
		this.ivaVenta = ivaVenta;
	}
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	

}
