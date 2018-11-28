package br.com.danielcampanha.sisgac.repository;

import br.com.danielcampanha.sisgac.repository.model.Aluno;

public interface AlunoRepository  extends AbstractRepository<Aluno, Long>{

	public Aluno getById(Long id);
}
