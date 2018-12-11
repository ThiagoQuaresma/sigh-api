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
@Table(schema = "public", name = "ufmed")
public class Ufmed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idufmed")
	private Long id;
	
	@Column(name="medico_idmedico")
	private Long medico_idmedico;
	
	@Column(name="lograd_med")
	private String lograd_med;
	
	@Column(name="num_logra_med")
	private Long num_logra_med;
	
	@Column(name="compl_logra_med")
	private String compl_logra_med;
	
	@Column(name="cep")
	private Long cep;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMedico_idmedico() {
		return medico_idmedico;
	}

	public void setMedico_idmedico(Long medico_idmedico) {
		this.medico_idmedico = medico_idmedico;
	}

	public String getLograd_med() {
		return lograd_med;
	}

	public void setLograd_med(String lograd_med) {
		this.lograd_med = lograd_med;
	}

	public Long getNum_logra_med() {
		return num_logra_med;
	}

	public void setNum_logra_med(Long num_logra_med) {
		this.num_logra_med = num_logra_med;
	}

	public String getCompl_logra_med() {
		return compl_logra_med;
	}

	public void setCompl_logra_med(String compl_logra_med) {
		this.compl_logra_med = compl_logra_med;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

}
