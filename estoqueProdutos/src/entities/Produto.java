package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	//gerando uma sobrecarga, isto é, o objeto agora possui duas formas de instanciação.
	public Produto() {
	}
	//criando o construtor do objeto para que não inicialize com valores default(null, 0.0, 0).
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalEstoque() {
		return preco*quantidade;
	}
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	//metodo toString p retornar o produto como Object default.
	public String toString() {
		return "Dados do produto: "+nome+
				", R$"+String.format("%.2f", preco)+", "+ quantidade+
				" unidades, valor total de estoque: R$"
				+String.format("%.2f", valorTotalEstoque());
	}
}
