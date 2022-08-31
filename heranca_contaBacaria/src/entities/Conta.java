package entities;

public class Conta {
	private Integer numero;
	private String nome;
	protected Double saldo;
	
	public Conta() {
	}
	public Conta(Integer numero, String nome, Double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(Double valor) {
		saldo +=valor;
	}
	public void saque(Double valor) {
		if(saldo - valor+5.0>=0) {
			saldo -=valor + 5.0;//esse valor de 5 é uma taxa cobrada.
		}
		else {
			System.out.println("Nao eh possivel sacar essa quantia!");
		}
	}
}
