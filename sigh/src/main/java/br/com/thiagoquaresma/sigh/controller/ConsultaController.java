package br.com.thiagoquaresma.sigh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiagoquaresma.sigh.repository.ConsultaRepository;
import br.com.thiagoquaresma.sigh.repository.model.Consulta;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaRepository consultaRepository;
	
	@GetMapping("/")
	public List<Consulta> findAll(){
	
	List<Consulta> consulta = consultaRepository.findAll();
	
	return consulta;
	}
	
	@PostMapping
	private void addConsulta(@RequestBody Consulta consulta) {
		
		consultaRepository.save(consulta);
		
		return;
	}
	
	@PutMapping
	private void updateConsulta(@RequestBody Consulta consulta) {
		
		consultaRepository.save(consulta);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteConsulta(@PathVariable Long id) {
		
		consultaRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Consulta getConsulta(@PathVariable Long id) {
		
		return consultaRepository.getById(id);
		
		
	}
}
