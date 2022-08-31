package entities;

public class FuncionarioTerceirizado extends Funcionario {
	private Double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHoras, Double despesaAdicional) {
		super(nome, horas, valorHoras);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double getDespesaAdiciional() {
		return despesaAdicional;
	}
	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento()+despesaAdicional*1.1;
	}
	
}
