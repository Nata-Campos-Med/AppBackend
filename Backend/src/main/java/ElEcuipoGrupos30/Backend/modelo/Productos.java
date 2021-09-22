package ElEcuipoGrupos30.Backend.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
	
	@Id
	private long codigo_producto;
	private String nombre_producto;
	private long nit_proveedor;
	private  double iva_producto;
	private double precio_compra;
	private double precio_venta;
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public double getIva_producto() {
		return iva_producto;
	}
	public void setIva_producto(double iva_producto) {
		this.iva_producto = iva_producto;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	

}
