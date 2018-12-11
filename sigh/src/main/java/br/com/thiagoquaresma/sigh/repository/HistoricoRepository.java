package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Historico;

public interface HistoricoRepository extends AbstractRepository<Historico, Long>{
	
	public Historico getById(Long id);
	
	public List<Historico> findAll(); 
}
