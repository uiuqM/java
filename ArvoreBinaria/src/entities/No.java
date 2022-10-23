package entities;

public class No<key> {
	private key valor;
	private No<key> esquerda;
	private No<key> direita;
	
	public No(key valor){
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	
	public key getValor() {
		return valor;
	}
	public void setValor(key valor) {
		this.valor = valor;
	}
	
	public No<key> getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No<key> esquerda) {
		this.esquerda = esquerda;
	}
	
	public No<key> getDireita(){
		return direita;
	}
	public void setDireita(No<key> direita) {
		this.direita = direita;
	}
}
