package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Uf;

public interface UfRepository extends AbstractRepository<Uf, Long>{

	public Uf getById(Long id);
	
	public List<Uf> findAll();
	
}
