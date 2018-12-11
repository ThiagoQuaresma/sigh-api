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

import br.com.thiagoquaresma.sigh.repository.MedicoRepository;
import br.com.thiagoquaresma.sigh.repository.model.Medico;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/medico")
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@GetMapping("/")
	public List<Medico> findAll(){
	
	List<Medico> medicos = medicoRepository.findAll();
	
	return medicos;
	}
	
	@PostMapping
	private void addMedico(@RequestBody Medico medico) {
		
		medicoRepository.save(medico);
		
		return;
	}
	
	@PutMapping
	private void updateMedico(@RequestBody Medico medico) {
		
		medicoRepository.save(medico);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteMedico(@PathVariable Long id) {
		
		medicoRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Medico getMedico(@PathVariable Long id) {
		
		return medicoRepository.getById(id);
		
		
	}

}
	
	
