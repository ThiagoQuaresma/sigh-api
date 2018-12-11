package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Atendimento;

public interface AtendimentoRepository extends AbstractRepository<Atendimento, Long>{
	
	public Atendimento getById(Long id);
	
	public List<Atendimento> findAll();
}
