package entities;

public class contaEmpresarial extends Conta {
	private Double emprestimoLimite;
	
	public contaEmpresarial() {
		super();
	}
	public contaEmpresarial(Integer numero, String nome, Double saldo, Double emprestimoLimite) {
		super(numero, nome, saldo);
		this.emprestimoLimite = emprestimoLimite;
	}
	
	public Double getEmprestimoLimite() {
		return emprestimoLimite;
	}
	public void setEmprestimoLimite(Double novoLimite) {
		this.emprestimoLimite = novoLimite;
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
	
	public void emprestimo(Double valor) {
		if(valor<=emprestimoLimite) {
			this.saldo +=valor;
		}
	}
}
