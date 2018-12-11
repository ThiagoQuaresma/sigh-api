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

import br.com.thiagoquaresma.sigh.repository.HistoricoRepository;
import br.com.thiagoquaresma.sigh.repository.model.Historico;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/historico")
public class HistoricoController {
	
	@Autowired
	private HistoricoRepository historicoRepository;
	
	@GetMapping("/")
	public List<Historico> findAll(){
	
	List<Historico> historico = historicoRepository.findAll();
	
	return historico;
	}
	
	@PostMapping
	private void addHistorico(@RequestBody Historico historico) {
		
		historicoRepository.save(historico);
		
		return;
	}
	
	@PutMapping
	private void updateHistorico(@RequestBody Historico historico) {
		
		historicoRepository.save(historico);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteHistorico(@PathVariable Long id) {
		
		historicoRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Historico getHistorico(@PathVariable Long id) {
		
		return historicoRepository.getById(id);
		
		
	}
}
