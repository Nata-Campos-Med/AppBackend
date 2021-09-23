package ElEcuipoGrupos30.Backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ElEcuipoGrupos30.Backend.DAO.VentasDAO;
import ElEcuipoGrupos30.Backend.modelo.Ventas;

@RestController
@RequestMapping ("ventas")
public class VentasAPI {
	
	@Autowired
	private VentasDAO ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar (@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	@GetMapping ("/listar")
	public List<Ventas> listar(){
		return ventasDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar")
	public void eliminar(@PathVariable ("id") Integer id) {
		ventasDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}

}
