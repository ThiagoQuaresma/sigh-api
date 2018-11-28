package br.com.danielcampanha.sisgac.repository;


import br.com.danielcampanha.sisgac.repository.model.Mentor;

public interface MentorRepository  extends AbstractRepository<Mentor, Long>{
	
	public Mentor getById(Long id);

}
