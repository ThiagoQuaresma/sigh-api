package br.com.danielcampanha.sisgac.repository.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "core", name = "mensalidade")
public class Mensalidade {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "valorPago")
	private float valorPago;
	
	@Column(name = "mesRef")
	private Integer mesRef;
	
	@Column(name = "anoRef")
	private Integer anoRef;
	
	@Column(name = "mesPag")
	private Integer mesPag;
	
	@Column(name = "anoPag")
	private Integer anoPag;
	
	@OneToOne
	@JoinColumn(name="mat")
	private Matricula matricula;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public Integer getMesRef() {
		return mesRef;
	}

	public void setMesRef(Integer mesRef) {
		this.mesRef = mesRef;
	}

	public Integer getAnoRef() {
		return anoRef;
	}

	public void setAnoRef(Integer anoRef) {
		this.anoRef = anoRef;
	}

	public Integer getMesPag() {
		return mesPag;
	}

	public void setMesPag(Integer mesPag) {
		this.mesPag = mesPag;
	}

	public Integer getAnoPag() {
		return anoPag;
	}

	public void setAnoPag(Integer anoPag) {
		this.anoPag = anoPag;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
