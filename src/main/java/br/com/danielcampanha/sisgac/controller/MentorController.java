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

import br.com.danielcampanha.sisgac.repository.model.Mentor;


@RestController
@RequestMapping(value="/mentor/")
public class MentorController {
	
	@Autowired
	private MentorRepository mentorRepository;

	
	@GetMapping
	public List<Mentor> findMentores() {
		
		List<Mentor> mentores = mentorRepository.findAll();
		
		return mentores;
	}
	
	@PostMapping
	public void addMentores(@RequestBody Mentor mentor) {
		
		mentorRepository.save(mentor);
		
		return;
	}
	
	@DeleteMapping("/{id}")
	public void deleteMentor(@PathVariable Long id) {
		
		mentorRepository.delete(id);
		
		return;
	}
	
	@PutMapping
	public void updateMentor(@RequestBody Mentor mentor) {
		
		mentorRepository.save(mentor);
		
		return;
	}
	
	@GetMapping("/{id}")
	public Mentor getMentor(@PathVariable Long id) {
		
		return mentorRepository.getById(id);
	}
	
	
}
