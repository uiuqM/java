package entities;

public class contaPoupanca extends Conta {
	private Double taxaJuro;
	
	public contaPoupanca() {
		super();
	}
	public contaPoupanca(Integer numero, String nome, Double saldo, Double taxaJuro) {
		super(numero, nome, saldo);
		this.taxaJuro = taxaJuro;
	}
	
	public Double getTaxaJuro(){
		return taxaJuro;
	}
	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	@Override //isso avisa ao compilador que é uma sobreposicao.
	public void saque(Double valor) {
		if(saldo-valor>=0.0) {
			saldo -=valor;
		}
		else{
			System.out.println("nao eh possivel sacar");
		}
	}
	
	public void atualizaSaldo() {
		saldo += saldo*taxaJuro;
	}
	
}
