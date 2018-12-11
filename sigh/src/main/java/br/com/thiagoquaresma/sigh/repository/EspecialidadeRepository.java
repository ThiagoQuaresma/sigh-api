package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Especialidade;

public interface EspecialidadeRepository extends AbstractRepository<Especialidade, Long>{

	public Especialidade getById(Long id);
	
	public List<Especialidade> findAll();
}
