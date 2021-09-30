package ElEcuipoGrupos30.Backend.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import ElEcuipoGrupos30.Backend.DAO.UsuariosDAO;
import ElEcuipoGrupos30.Backend.modelo.Usuarios;



@RestController
@RequestMapping("usuarios")
public class UsuariosAPI {
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);		
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuariosDAO.findAll();		
	}
		
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		usuariosDAO.deleteById(id);		
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);
	}
}
