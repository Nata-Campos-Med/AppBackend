package ElEcuipoGrupos30.Backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ElEcuipoGrupos30.Backend.DAO.DetalleVentasDAO;
import ElEcuipoGrupos30.Backend.modelo.DetalleVentas;


@RestController
@RequestMapping ("Detalle_ventas")

public class DetalleVentasAPI {

	@Autowired
	private DetalleVentasDAO detalleVentasDAO;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestBody DetalleVentas detallesVentas) {
		detalleVentasDAO.save(detallesVentas);
	}
	
	@GetMapping ("/listar")
	public List<DetalleVentas> listar(){
		return detalleVentasDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar")
	public void eliminar(@PathVariable ("id") Long id) {
		detalleVentasDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody DetalleVentas detallesVentas) {
		detalleVentasDAO.save(detallesVentas);
	}

}


