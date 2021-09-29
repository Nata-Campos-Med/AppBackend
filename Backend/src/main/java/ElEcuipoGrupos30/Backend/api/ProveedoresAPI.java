package ElEcuipoGrupos30.Backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import ElEcuipoGrupos30.Backend.DAO.ProveedoresDAO;
import ElEcuipoGrupos30.Backend.modelo.Proveedores;


@RestController
@RequestMapping ("proveedores")
public class ProveedoresAPI {

	@Autowired
	private ProveedoresDAO proveedoresDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	
	@GetMapping ("/listar")
	public List<Proveedores> listar(){
		return proveedoresDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar(@PathVariable ("id") Long id) {
		proveedoresDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Proveedores proveedores) {
		proveedoresDAO.save(proveedores);
	}
	

}
