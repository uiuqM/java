package model.services;

public class ServicoPayPal implements ServicoDePagamentoOnline{

	@Override
	public double taxaPagamento(double quantia) {
		return quantia*0.02;
	}

	@Override
	public double juros(double quantia, Integer meses) {
		return quantia*0.01*meses;
	}

}
