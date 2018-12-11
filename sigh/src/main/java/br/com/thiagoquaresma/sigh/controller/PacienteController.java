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

import br.com.thiagoquaresma.sigh.repository.PacienteRepository;
import br.com.thiagoquaresma.sigh.repository.model.Paciente;


@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/")
	public List<Paciente> findAll(){
	
	List<Paciente> paciente = pacienteRepository.findAll();
	
	return paciente;
	}
	
	@PostMapping
	private void addPaciente(@RequestBody Paciente paciente) {
		
		pacienteRepository.save(paciente);
		
		return;
	}
	
	@PutMapping
	private void updatePaciente(@RequestBody Paciente paciente) {
		
		pacienteRepository.save(paciente);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deletePaciente(@PathVariable Long id) {
		
		pacienteRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Paciente getPaciente(@PathVariable Long id) {
		
		return pacienteRepository.getById(id);
		
		
	}
}
