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

import br.com.thiagoquaresma.sigh.repository.AgendaRepository;
import br.com.thiagoquaresma.sigh.repository.model.Agenda;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/agenda")
public class AgendaController {

	@Autowired
	private AgendaRepository agendaRepository;
	
	@GetMapping("/")
	public List<Agenda> findAll(){
	
	List<Agenda> agenda = agendaRepository.findAll();
	
	return agenda;
	}
	
	@PostMapping
	private void addAgenda(@RequestBody Agenda agenda) {
		
		agendaRepository.save(agenda);
		
		return;
	}
	
	@PutMapping
	private void updateAgenda(@RequestBody Agenda agenda) {
		
		agendaRepository.save(agenda);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteAgenda(@PathVariable Long id) {
		
		agendaRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Agenda getAgenda(@PathVariable Long id) {
		
		return agendaRepository.getById(id);
		
		
	}
}
