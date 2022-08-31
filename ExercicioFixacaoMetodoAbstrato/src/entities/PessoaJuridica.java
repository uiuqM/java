package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public Integer getNumFuncionarios(){
		return numFuncionarios;
	}
	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	public Double calculaImposto() {
		if(numFuncionarios>10) {
			return rendaAnual*0.14;
		}
		return rendaAnual * 0.16;
	}
	public String toString() {
		return String.format("%s : R$%.2f", getNome(), calculaImposto());
	}
}
