package br.com.danielcampanha.sisgac.repository;


import br.com.danielcampanha.sisgac.repository.model.Endereco;

public interface EnderecoRepository  extends AbstractRepository<Endereco, Long>{

	public Endereco getById(Long id);
}
