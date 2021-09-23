package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
	
	@Id
	@Column(name="codigo_producto")
	private long codigoProducto;
	@Column(name="nombre_producto")
	private String nombreProducto;
	@Column(name="nit_proveedor")
	private long nitProveedor;
	@Column(name="iva_producto")
	private  double ivaProducto;
	@Column(name="precio_compra")
	private double precioCompra;
	@Column(name="precio_venta")
	private double precioVenta;
	
	public long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public long getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(long nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public double getIvaProducto() {
		return ivaProducto;
	}
	public void setIvaProducto(double ivaProducto) {
		this.ivaProducto = ivaProducto;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	

}
