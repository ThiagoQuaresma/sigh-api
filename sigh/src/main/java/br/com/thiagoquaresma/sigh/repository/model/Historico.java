package br.com.thiagoquaresma.sigh.repository.model;

import java.sql.Date;
import java.sql.Time;

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
@Table(schema = "public", name = "historico")
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idhistorico")
	private long id;
	
	@Column(name="desc_historico")
	private String desc_historico;
	
	@Column(name="data_consulta")
	private Date data_consulta;
	
	@Column(name="hora_consulta")
	private Time hora_consulta;
	
	@Column(name="historico_nome_pac")
	private String historico_nome_pac;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesc_historico() {
		return desc_historico;
	}

	public void setDesc_historico(String desc_historico) {
		this.desc_historico = desc_historico;
	}

	public Date getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	public Time getHora_consulta() {
		return hora_consulta;
	}

	public void setHora_consulta(Time hora_consulta) {
		this.hora_consulta = hora_consulta;
	}

	public String getHistorico_nome_pac() {
		return historico_nome_pac;
	}

	public void setHistorico_nome_pac(String historico_nome_pac) {
		this.historico_nome_pac = historico_nome_pac;
	}

}
