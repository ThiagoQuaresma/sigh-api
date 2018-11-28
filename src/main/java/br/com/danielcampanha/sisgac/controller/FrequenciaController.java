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

import br.com.danielcampanha.sisgac.repository.FrequenciaRepository;
import br.com.danielcampanha.sisgac.repository.MatriculaRepository;
import br.com.danielcampanha.sisgac.repository.model.Frequencia;
import br.com.danielcampanha.sisgac.repository.model.Matricula;

@RestController
@RequestMapping(value="/frequencia/")
public class FrequenciaController {
	
	@Autowired
	private FrequenciaRepository frequenciaRepository;

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	
	@GetMapping
	public List<Frequencia> findFrequencias() {
		
		List<Frequencia> frequencias = frequenciaRepository.findAll();
		
		return frequencias;
	}
	
	@PostMapping
	public void addFrequencia(@RequestBody Frequencia frequencia) {
		
		frequenciaRepository.save(frequencia);
		
		return;
	}
	
	@DeleteMapping("/{id}/")
	public void deleteFrequencia(@PathVariable Long id) {
		
		frequenciaRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateFrequencia(@RequestBody Frequencia frequencia) {
		
		frequenciaRepository.save(frequencia);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Frequencia getFrequencia(@PathVariable Long id) {
		
		return frequenciaRepository.getById(id);
		
		
	}
	
	@PostMapping("/mat")
	public void insertMatricula(@RequestBody Matricula matricula) {
		
		matriculaRepository.save(matricula);
		
		return;
	}
	
	
	
}
