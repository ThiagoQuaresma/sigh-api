package br.com.danielcampanha.sisgac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielcampanha.sisgac.repository.MatriculaRepository;
import br.com.danielcampanha.sisgac.repository.MensalidadeRepository;
import br.com.danielcampanha.sisgac.repository.model.Matricula;
import br.com.danielcampanha.sisgac.repository.model.Mensalidade;

@RestController
@RequestMapping(value="/mensalidade/")
public class MensalidadeController {
	
	@Autowired
	private MensalidadeRepository mensalidadeRepository;

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	
	@GetMapping
	public List<Mensalidade> findMensalidades() {
		
		List<Mensalidade> mensalidades = mensalidadeRepository.findAll();
		
		return mensalidades;
	}
	
	@PostMapping
	public void addMensalidade(@RequestBody Mensalidade mensalidade) {
		
		mensalidadeRepository.save(mensalidade);
		
		return;
	}
	
	@DeleteMapping("/{id}/")
	public void deleteMensalidade(@PathVariable Long id) {
		
		mensalidadeRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateMensalidade(@RequestBody Mensalidade mensalidade) {
		
		mensalidadeRepository.save(mensalidade);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Mensalidade getMensalidade(@PathVariable Long id) {
		
		return mensalidadeRepository.getById(id);
		
		
	}
	
	@PostMapping("/mat")
	public void insertMatricula(@RequestBody Matricula matricula) {
		
		matriculaRepository.save(matricula);
		
		return;
	}
	
	
	
}
