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

import br.com.danielcampanha.sisgac.repository.MentorRepository;
import br.com.danielcampanha.sisgac.repository.TurmaRepository;
import br.com.danielcampanha.sisgac.repository.model.Mentor;
import br.com.danielcampanha.sisgac.repository.model.Turma;


@RestController
@RequestMapping(value="/turma/")
public class TurmaController {

	@Autowired
	private TurmaRepository turmaRepository;
	
	@Autowired
	private MentorRepository mentorRepository;
	
	
	@GetMapping
	public List<Turma> findTurmas() {
		
		List<Turma> turmas = turmaRepository.findAll();
		
		return turmas;
	}
	
	@PostMapping
	public void addTurma(@RequestBody Turma turma) {
		
		turmaRepository.save(turma);
		
		return;
	}
	
	@PostMapping("/{mentor}")
	public void addMentor(@RequestBody Mentor mentor) {
		
		mentorRepository.save(mentor);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	public void deleteTurma(@PathVariable Long id) {
		
		turmaRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateTurma(@RequestBody Turma turma) {
		
		turmaRepository.save(turma);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Turma getTurma(@PathVariable Long id) {
		
		return turmaRepository.getById(id);
		
		
	}
	
	
}
