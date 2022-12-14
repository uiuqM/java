package entities;

public class PessoaFisica extends Pessoa{
	Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	
	@Override
	public Double calculaImposto(){
		if(rendaAnual<20000) {
			return (rendaAnual*0.15)-(gastoSaude*0.5);
		}
		return (rendaAnual *0.25)-(gastoSaude*0.5);
	}
	
	public String toString() {
		return String.format("%s : R$%.2f", getNome(), calculaImposto());
	}
}
