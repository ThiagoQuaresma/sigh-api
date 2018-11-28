package br.com.danielcampanha.sisgac.repository;

import br.com.danielcampanha.sisgac.repository.model.Turma;

public interface TurmaRepository  extends AbstractRepository<Turma, Long>{

	public Turma getById(Long id);
}
