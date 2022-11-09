package entities;

public class Pagamento {
	private Double pagamentoBasico, imposto;
	
	public Pagamento(Double pagamentoBasico, Double imposto) {
		this.pagamentoBasico = pagamentoBasico;
		this.imposto = imposto;
	}
	
	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}
	
	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}
	
	public Double getImposto() {
		return imposto;
	}
	
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double pagamentoTotal() {
		return getPagamentoBasico() + getImposto();
	}
}
