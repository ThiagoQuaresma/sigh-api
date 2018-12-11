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
@Table(schema = "public", name = "atendimento")
public class Atendimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idatendimento")
	private Long id;
	
	@Column(name="consulta_medico_idmedico")
	private Long consulta_medico_idmedico;
	
	@Column(name="consulta_paciente_idpaciente")
	private Long consulta_paciente_idpaciente;

	@Column(name="consulta_idconsulta")
	private Long consulta_idconsulta;
	
	@Column(name="historico_idhistorico")
	private Long historico_idhistorico;
	
	@Column(name="usa_medicamento")
	private Boolean usa_medicamento;
	
	@Column(name="desc_medicamento")
	private String desc_medicamento;
	
	@Column(name="sintoma")
	private String sintoma;
	
	@Column(name="alergico")
	private Boolean alergico;
	
	@Column(name="desc_alergico")
	private String desc_alergico;
	
	@Column(name="doenca_hereditaria")
	private Boolean doenca_hereditaria;
	
	@Column(name="desc_doenca_hereditaria")
	private String desc_doenca_hereditaria;
	
	@Column(name="info_extra")
	private String info_extra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConsulta_medico_idmedico() {
		return consulta_medico_idmedico;
	}

	public void setConsulta_medico_idmedico(Long consulta_medico_idmedico) {
		this.consulta_medico_idmedico = consulta_medico_idmedico;
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

	public Long getHistorico_idhistorico() {
		return historico_idhistorico;
	}

	public void setHistorico_idhistorico(Long historico_idhistorico) {
		this.historico_idhistorico = historico_idhistorico;
	}

	public Boolean getUsa_medicamento() {
		return usa_medicamento;
	}

	public void setUsa_medicamento(Boolean usa_medicamento) {
		this.usa_medicamento = usa_medicamento;
	}

	public String getDesc_medicamento() {
		return desc_medicamento;
	}

	public void setDesc_medicamento(String desc_medicamento) {
		this.desc_medicamento = desc_medicamento;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public Boolean getAlergico() {
		return alergico;
	}

	public void setAlergico(Boolean alergico) {
		this.alergico = alergico;
	}

	public String getDesc_alergico() {
		return desc_alergico;
	}

	public void setDesc_alergico(String desc_alergico) {
		this.desc_alergico = desc_alergico;
	}

	public Boolean getDoenca_hereditaria() {
		return doenca_hereditaria;
	}

	public void setDoenca_hereditaria(Boolean doenca_hereditaria) {
		this.doenca_hereditaria = doenca_hereditaria;
	}

	public String getDesc_doenca_hereditaria() {
		return desc_doenca_hereditaria;
	}

	public void setDesc_doenca_hereditaria(String desc_doenca_hereditaria) {
		this.desc_doenca_hereditaria = desc_doenca_hereditaria;
	}

	public String getInfo_extra() {
		return info_extra;
	}

	public void setInfo_extra(String info_extra) {
		this.info_extra = info_extra;
	}
}
