package br.com.danielcampanha.sisgac.repository;


import br.com.danielcampanha.sisgac.repository.model.Atividade;

public interface AtividadeRepository  extends AbstractRepository<Atividade, Long>{
	
	public Atividade getById(Long id);

}
