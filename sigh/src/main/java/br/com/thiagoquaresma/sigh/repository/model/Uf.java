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
@Table(schema = "public", name = "uf")
public class Uf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="iduf")
	private Long id;
	
	@Column(name="paciente_idpaciente")
	private Long Paciente_idPaciente;
	
	@Column(name="lograd_pac")
	private String lograd_pac;
	
	@Column(name="num_logra_pac")
	private Long num_logra_pac;
	
	@Column(name="compl_logra_pac")
	private String compl_logra_pac;
	
	@Column(name="cep")
	private Long cep;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaciente_idPaciente() {
		return Paciente_idPaciente;
	}

	public void setPaciente_idPaciente(Long paciente_idPaciente) {
		Paciente_idPaciente = paciente_idPaciente;
	}

	public String getLograd_pac() {
		return lograd_pac;
	}

	public void setLograd_pac(String lograd_pac) {
		this.lograd_pac = lograd_pac;
	}

	public Long getNum_logra_pac() {
		return num_logra_pac;
	}

	public void setNum_logra_pac(Long num_logra_pac) {
		this.num_logra_pac = num_logra_pac;
	}

	public String getCompl_logra_pac() {
		return compl_logra_pac;
	}

	public void setCompl_logra_pac(String compl_logra_pac) {
		this.compl_logra_pac = compl_logra_pac;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}


	
}
