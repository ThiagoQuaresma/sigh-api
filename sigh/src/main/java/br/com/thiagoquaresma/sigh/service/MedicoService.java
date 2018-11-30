package br.com.thiagoquaresma.sigh.service;

import br.com.thiagoquaresma.sigh.repository.model.Medico;

public class MedicoService {

	private Medico medico;
	
//	private void addMedico() {
//		// TODO Auto-generated method stub
//
//	}
//	
//	private void updateMedico() {
//		// TODO Auto-generated method stub
//
//	}
//	
//	private void deleteMedico() {
//		// TODO Auto-generated method stub
//
//	}
//	
//	private void findMedico() {
//		// TODO Auto-generated method stub
//
//	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}
