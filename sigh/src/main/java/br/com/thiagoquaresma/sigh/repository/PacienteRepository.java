package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Paciente;

public interface PacienteRepository extends AbstractRepository<Paciente, Long>{
	
	public Paciente getById(Long id);
	
	public List<Paciente> findAll(); 
}
