package br.com.thiagoquaresma.sigh.repository.model;

import java.sql.Date;

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
@Table(schema = "public", name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idconsulta")
	private Long id;
	
	@Column(name="paciente_idpaciente")
	private Long paciente_idpaciente;
	
	@Column(name="medico_idmedico")
	private Long Medico_idMedico;
	
	@Column(name="consulta_nome_pac")
	private String consulta_nome_pac;
	
	@Column(name="consulta_nome_med")
	private String consulta_nome_med;
	
	@Column(name="data_consulta")
	private Date data_consulta;
	
	@Column(name="especialidade")
	private String especialidade;
	
	@Column(name="hora")
	private String hora;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="plano")
	private String plano;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaciente_idpaciente() {
		return paciente_idpaciente;
	}

	public void setPaciente_idpaciente(Long paciente_idpaciente) {
		this.paciente_idpaciente = paciente_idpaciente;
	}

	public Long getMedico_idMedico() {
		return Medico_idMedico;
	}

	public void setMedico_idMedico(Long medico_idMedico) {
		Medico_idMedico = medico_idMedico;
	}

	public String getConsulta_nome_pac() {
		return consulta_nome_pac;
	}

	public void setConsulta_nome_pac(String consulta_nome_pac) {
		this.consulta_nome_pac = consulta_nome_pac;
	}

	public String getConsulta_nome_med() {
		return consulta_nome_med;
	}

	public void setConsulta_nome_med(String consulta_nome_med) {
		this.consulta_nome_med = consulta_nome_med;
	}

	public Date getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
}
