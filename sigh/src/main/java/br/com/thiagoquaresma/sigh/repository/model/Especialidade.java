package br.com.thiagoquaresma.sigh.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "public", name = "especialidade")
public class Especialidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idespecialidade")
	private Long id;
	
	@Column(name="medico_idmedico")
	private Long Medico_idMedico;
	
	@Column(name="desc_especialidade")
	private String desc_especialidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMedico_idMedico() {
		return Medico_idMedico;
	}

	public void setMedico_idMedico(Long medico_idMedico) {
		Medico_idMedico = medico_idMedico;
	}

	public String getDesc_especialidade() {
		return desc_especialidade;
	}

	public void setDesc_especialidade(String desc_especialidade) {
		this.desc_especialidade = desc_especialidade;
	}
}
