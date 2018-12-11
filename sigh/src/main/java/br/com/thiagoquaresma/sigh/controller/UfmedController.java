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

import br.com.thiagoquaresma.sigh.repository.UfmedRepository;
import br.com.thiagoquaresma.sigh.repository.model.Ufmed;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/ufmed")
public class UfmedController {


	
	@Autowired
	private UfmedRepository ufmedRepository;
	
	@GetMapping("/")
	public List<Ufmed> findAll(){
	
	List<Ufmed> ufmed = ufmedRepository.findAll();
	
	return ufmed;
	}
	
	@PostMapping
	private void addUfmed(@RequestBody Ufmed ufmed) {
		
		ufmedRepository.save(ufmed);
		
		return;
	}

	@PutMapping
	private void updateUfmed(@RequestBody Ufmed ufmed) {
		
		ufmedRepository.save(ufmed);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteUfmed(@PathVariable Long id) {
		
		ufmedRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Ufmed getUfmed(@PathVariable Long id) {
		
		return ufmedRepository.getById(id);
		
		
	}
}
