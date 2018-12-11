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

import br.com.thiagoquaresma.sigh.repository.UfRepository;
import br.com.thiagoquaresma.sigh.repository.model.Uf;



@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/uf")
public class UfController {
	
	@Autowired
	private UfRepository ufRepository;
	
	@GetMapping("/")
	public List<Uf> findAll(){
	
	List<Uf> uf = ufRepository.findAll();
	
	return uf;
	}
	
	@PostMapping
	private void addUf(@RequestBody Uf uf) {
		
		ufRepository.save(uf);
		
		return;
	}

	@PutMapping
	private void updateUf(@RequestBody Uf uf) {
		
		ufRepository.save(uf);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	private void deleteUf(@PathVariable Long id) {
		
		ufRepository.delete(id);

		return;
	}
	
	@GetMapping("/{id}")
	public Uf getUf(@PathVariable Long id) {
		
		return ufRepository.getById(id);
		
		
	}

}
