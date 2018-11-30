package br.com.thiagoquaresma.sigh.repository;

import br.com.thiagoquaresma.sigh.repository.model.Medico;

public interface MedicoRepository  extends AbstractRepository<Medico, Long>{

	public Medico getById(Long id);
}