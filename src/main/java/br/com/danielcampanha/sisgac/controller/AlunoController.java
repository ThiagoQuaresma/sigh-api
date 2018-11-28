package br.com.danielcampanha.sisgac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielcampanha.sisgac.repository.AlunoRepository;
import br.com.danielcampanha.sisgac.repository.model.Aluno;

//@CrossOrigin("*")
@RestController
@RequestMapping(value="/aluno/")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	
	@GetMapping
	public List<Aluno> findAlunos() {
		
		List<Aluno> alunos = alunoRepository.findAll();
		
		return alunos;
	}
	
	@PostMapping
	public void addAlunos(@RequestBody Aluno aluno) {
		
		alunoRepository.save(aluno);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id) {
		
		alunoRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateAluno(@RequestBody Aluno aluno) {
		
		alunoRepository.save(aluno);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id) {
		
		return alunoRepository.getById(id);
		
		
	}
	
}
