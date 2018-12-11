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

import br.com.thiagoquaresma.sigh.repository.AtendimentoRepository;
import br.com.thiagoquaresma.sigh.repository.model.Atendimento;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/atendimento")
public class AtendimentoController {
	
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	@GetMapping("/")
	public List<Atendimento> findAll(){
	
	List<Atendimento> atendimento = atendimentoRepository.findAll();
	
	return atendimento;
	}
	
	@PostMapping
	private void addAtendimento(@RequestBody Atendimento atendimento) {
		
		atendimentoRepository.save(atendimento);
		
		return;
	}
	
	@PutMapping
	private void updateAtendimento(@RequestBody Atendimento atendimento) {
		
		atendimentoRepository.save(atendimento);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteAtendimento(@PathVariable Long id) {
		
		atendimentoRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Atendimento getAtendimento(@PathVariable Long id) {
		
		return atendimentoRepository.getById(id);
		
		
	}
}
