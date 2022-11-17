package model.services;

public interface ServicoDePagamentoOnline {
	public double taxaPagamento(double quantia);
	public double juros(double quantia, Integer meses);
}
