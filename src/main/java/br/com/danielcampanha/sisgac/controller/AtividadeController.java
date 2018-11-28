package br.com.danielcampanha.sisgac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielcampanha.sisgac.repository.AtividadeRepository;
import br.com.danielcampanha.sisgac.repository.TurmaRepository;
import br.com.danielcampanha.sisgac.repository.model.Atividade;
import br.com.danielcampanha.sisgac.repository.model.Turma;

@RestController
@RequestMapping(value="/atividade/")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private TurmaRepository turmaRepository;

	
	@GetMapping
	public List<Atividade> findAtividade() {
		
		List<Atividade> atividades = atividadeRepository.findAll();
		
		return atividades;
	}
	
	@PostMapping
	public void addAtividades(@RequestBody Atividade atividade) {
		
		atividadeRepository.save(atividade);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	public void deleteAtividade(@PathVariable Long id) {
		
		atividadeRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateAtividade(@RequestBody Atividade atividade) {
		
		atividadeRepository.save(atividade);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Atividade getAtividade(@PathVariable Long id) {
		
		return atividadeRepository.getById(id);
		
		
	}
	
	@PostMapping("/turma")
	public void insertTurma(@RequestBody Turma turma) {
		
		turmaRepository.save(turma);
		
		return;
	}
	
}
