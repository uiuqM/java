package entities;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double aumentaSalario(double percentual) {
		salario = salario*(percentual+100)/100;
		return salario;
	}
}
