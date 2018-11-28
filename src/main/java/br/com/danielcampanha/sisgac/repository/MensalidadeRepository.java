package br.com.danielcampanha.sisgac.repository;

import br.com.danielcampanha.sisgac.repository.model.Mensalidade;


public interface MensalidadeRepository  extends AbstractRepository<Mensalidade, Long>{

	public Mensalidade getById(Long id);
}
