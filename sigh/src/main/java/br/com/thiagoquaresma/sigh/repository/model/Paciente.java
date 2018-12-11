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
@Table(schema = "public", name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpaciente")
	private Long id;
	
	@Column(name = "nome_pac")
	private String name;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name = "data_nasc")
	private Date nasci;
	
	@Column(name = "plano")
	private Long plano;

	@Column(name = "nome_plano")
	private String nome_plano;
	
	@Column(name = "cpf_pac")
	private Long cpf;
	
	@Column(name = "rg_pac")
	private Long rg;
	
	@Column(name = "email_pac")
	private String email;

	@Column(name = "sexo_pac")
	private String sexo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getNasci() {
		return nasci;
	}

	public void setNasci(Date nasci) {
		this.nasci = nasci;
	}

	public Long getPlano() {
		return plano;
	}

	public void setPlano(Long plano) {
		this.plano = plano;
	}

	public String getNome_plano() {
		return nome_plano;
	}

	public void setNome_plano(String nome_plano) {
		this.nome_plano = nome_plano;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
