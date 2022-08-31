package entities;

public class Funcionario {
	private String nome;
	protected Integer horas;
	protected Double valorHoras;
	
	public Funcionario() {
	}
	public Funcionario(String nome, Integer horas, Double valorHoras){
		this.nome = nome;
		this.horas = horas;
		this.valorHoras = valorHoras;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double getValorHora() {
		return valorHoras;
	}
	public void setValorHora(Double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public Double pagamento() {
		return horas*valorHoras;
	}
}
