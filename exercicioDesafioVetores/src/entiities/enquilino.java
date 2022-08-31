package entiities;

public class enquilino {
	private String nome, email;
	private int quarto;
	
	public enquilino() {
	}
	public enquilino(String nome, String email, int num) {
		this.nome = nome;
		this.email = email;
		quarto = num;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
}
