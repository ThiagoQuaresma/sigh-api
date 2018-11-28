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

import br.com.danielcampanha.sisgac.repository.AlunoRepository;
import br.com.danielcampanha.sisgac.repository.MatriculaRepository;
import br.com.danielcampanha.sisgac.repository.TurmaRepository;
import br.com.danielcampanha.sisgac.repository.model.Aluno;
import br.com.danielcampanha.sisgac.repository.model.Matricula;
import br.com.danielcampanha.sisgac.repository.model.Turma;


@RestController
@RequestMapping(value="/matricula/")
public class MatriculaController {
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private TurmaRepository turmaRepository;

	
	@GetMapping
	public List<Matricula> findMatriculas() {
		
		List<Matricula> matriculas = matriculaRepository.findAll();
		
		return matriculas;
	}
	
	@PostMapping
	public void addMatricula(@RequestBody Matricula matricula) {
		
		matriculaRepository.save(matricula);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	public void deleteMatricula(@PathVariable Long id) {
		
		matriculaRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateMatricula(@RequestBody Matricula matricula) {
		
		matriculaRepository.save(matricula);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Matricula getMatricula(@PathVariable Long id) {
		
		return matriculaRepository.getById(id);
		
		
	}
	
	@PostMapping("/aluno")
	public void insertAluno(@RequestBody Aluno aluno) {
		
		alunoRepository.save(aluno);
		
		return;
	}
	
	@PostMapping("/turma")
	public void insertTurma(@RequestBody Turma turma) {
		
		turmaRepository.save(turma);
		
		return;
	}
	
}
