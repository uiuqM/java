package model.services;

import model.entities.Contrato;

public class GeraContrato {
	private Contrato contrato;
	private Integer meses;
	private double val, valorParc;
	
	public void processa(Contrato contrato, Integer meses) {
		val = contrato.getValorCont();
		valorParc = val/meses;
		
	}
	
}
