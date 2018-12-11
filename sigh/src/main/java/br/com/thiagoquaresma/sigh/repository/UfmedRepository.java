package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Ufmed;

public interface UfmedRepository extends AbstractRepository<Ufmed, Long>{

	public Ufmed getById(Long id);
	
	public List<Ufmed> findAll();
}
