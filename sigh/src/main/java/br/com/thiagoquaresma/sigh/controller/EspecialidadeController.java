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

import br.com.thiagoquaresma.sigh.repository.EspecialidadeRepository;
import br.com.thiagoquaresma.sigh.repository.model.Especialidade;


@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/especialidade")
public class EspecialidadeController {


	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	@GetMapping("/")
	public List<Especialidade> findAll(){
	
	List<Especialidade> especialidade = especialidadeRepository.findAll();
	
	return especialidade;
	}
	
	@PostMapping
	private void addEspecialidade(@RequestBody Especialidade especialidade) {
		
		especialidadeRepository.save(especialidade);
		
		return;
	}
	
	@PutMapping
	private void updateEspecialidade(@RequestBody Especialidade especialidade) {
		
		especialidadeRepository.save(especialidade);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteEspecialidade(@PathVariable Long id) {
		
		especialidadeRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Especialidade getEspecialidade(@PathVariable Long id) {
		
		return especialidadeRepository.getById(id);
		
		
	}
}
