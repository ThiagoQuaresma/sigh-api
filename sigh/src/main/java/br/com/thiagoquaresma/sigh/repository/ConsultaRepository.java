package br.com.thiagoquaresma.sigh.repository;

import java.util.List;

import br.com.thiagoquaresma.sigh.repository.model.Consulta;

public interface ConsultaRepository extends AbstractRepository<Consulta, Long> {

	public Consulta getById(Long id);
	
	public List<Consulta> findAll();
}
