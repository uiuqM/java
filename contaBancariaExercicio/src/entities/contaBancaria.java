package entities;

public class contaBancaria {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public contaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public contaBancaria(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(saldo);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor+5.0;
	}
}
