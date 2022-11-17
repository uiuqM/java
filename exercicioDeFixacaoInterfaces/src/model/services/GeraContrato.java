package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class GeraContrato {
	private double val, valorParc;
	private ServicoDePagamentoOnline servicoDePagamentoOnline;
	
	public GeraContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
	public void processa(Contrato contrato, Integer meses) {
		val = contrato.getValorCont();
		valorParc = val/meses;
		for(int i=1;i<=meses;i++) {
			LocalDate vencimento = contrato.getData().plusMonths(i);
			
			double juro = servicoDePagamentoOnline.juros(valorParc, i);
			double taxa = servicoDePagamentoOnline.taxaPagamento(valorParc+juro);
			
			double valor = valorParc+taxa+juro;
			contrato.getParcelas().add(new Parcela(vencimento, valor));

		}
	}
	
}
