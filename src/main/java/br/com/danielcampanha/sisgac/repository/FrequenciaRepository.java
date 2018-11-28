package br.com.danielcampanha.sisgac.repository;

import br.com.danielcampanha.sisgac.repository.model.Frequencia;

public interface FrequenciaRepository  extends AbstractRepository<Frequencia, Long>{

	public Frequencia getById(Long id);
}
