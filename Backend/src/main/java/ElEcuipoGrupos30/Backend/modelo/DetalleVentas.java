package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_ventas")
public class DetalleVentas {
	
	@Id
	@Column(name="codigo_detalle_venta")
	private long codigoDetalleVenta;
	@Column(name="cantidad_producto")
	private int cantidadProducto;
	@Column(name="codigo_producto")
	private long codigoProducto;
	@Column(name="codigo_venta")
	private long codigoVenta;
	@Column(name="valor_total")
	private double valorTotal;
	@Column(name="valor_venta")
	private double valorVenta;
	@Column(name="valor_iva")
	private double valorIva;
	
	public long getCodigoDetalleVenta() {
		return codigoDetalleVenta;
	}
	public void setCodigoDetalleVenta(long codigoDetalleVenta) {
		this.codigoDetalleVenta = codigoDetalleVenta;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public long getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
	public double getValorIva() {
		return valorIva;
	}
	public void setValorIva(double valorIva) {
		this.valorIva = valorIva;
	}
	
	
}
