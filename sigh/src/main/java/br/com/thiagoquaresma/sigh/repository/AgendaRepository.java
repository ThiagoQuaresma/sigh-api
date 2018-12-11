package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Agenda;

public interface AgendaRepository extends AbstractRepository<Agenda, Long>{

	public Agenda getById(Long id);
	
	public List<Agenda> findAll();
}
