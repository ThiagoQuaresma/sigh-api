package br.com.danielcampanha.sisgac.repository;

import br.com.danielcampanha.sisgac.repository.model.Matricula;

public interface MatriculaRepository  extends AbstractRepository<Matricula, Long>{

	public Matricula getById(Long id);
}
