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
@Table(schema = "public", name = "agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idagenda")
	private Long id;
	
	@Column(name="consulta_paciente_idpaciente")
	private Long consulta_paciente_idpaciente;
	
	@Column(name="consulta_idconsulta")
	private Long consulta_idconsulta;
	
	@Column(name="consulta_medico_idmedico")
	private Long consulta_medico_idmedico;
	
	@Column(name="ano")
	private Long ano;
	
	@Column(name="dia")
	private Long dia;
	
	@Column(name="mes")
	private Long mes;
	
	@Column(name="status_dia")
	private Long status_dia;
	
	@Column(name="desc_status_dia")
	private String desc_status_dia;
	
	@Column(name="status_mes")
	private Long status_mes;
	
	@Column(name="desc_status")
	private String desc_status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConsulta_paciente_idpaciente() {
		return consulta_paciente_idpaciente;
	}

	public void setConsulta_paciente_idpaciente(Long consulta_paciente_idpaciente) {
		this.consulta_paciente_idpaciente = consulta_paciente_idpaciente;
	}

	public Long getConsulta_idconsulta() {
		return consulta_idconsulta;
	}

	public void setConsulta_idconsulta(Long consulta_idconsulta) {
		this.consulta_idconsulta = consulta_idconsulta;
	}

	public Long getConsulta_medico_idmedico() {
		return consulta_medico_idmedico;
	}

	public void setConsulta_medico_idmedico(Long consulta_medico_idmedico) {
		this.consulta_medico_idmedico = consulta_medico_idmedico;
	}

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

	public Long getDia() {
		return dia;
	}

	public void setDia(Long dia) {
		this.dia = dia;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getStatus_dia() {
		return status_dia;
	}

	public void setStatus_dia(Long status_dia) {
		this.status_dia = status_dia;
	}

	public String getDesc_status_dia() {
		return desc_status_dia;
	}

	public void setDesc_status_dia(String desc_status_dia) {
		this.desc_status_dia = desc_status_dia;
	}

	public Long getStatus_mes() {
		return status_mes;
	}

	public void setStatus_mes(Long status_mes) {
		this.status_mes = status_mes;
	}

	public String getDesc_status() {
		return desc_status;
	}

	public void setDesc_status(String desc_status) {
		this.desc_status = desc_status;
	}
	
	
}
