package entities;

public class ArvoreBinaria<key extends Comparable<key>>{
	private No<key> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void adiciona(key valor) {
		No<key> novoNo = new No<key>(valor); //valor raiz
		if(raiz == null) {
			this.raiz = novoNo;
		} 
		else {
			No<key> atual = this.raiz;
			while(true) {
				if(novoNo.getValor().compareTo(atual.getValor()) == -1) {//compara se o elemento que vai inserir eh menor que a raiz
					if(atual.getEsquerda() != null) {//havendo filho compara com ele
						atual = atual.getEsquerda();
					}
					else {
						atual.setEsquerda(novoNo);
						break;
					}
				}
				else {
					if(atual.getDireita() != null) {
						atual = atual.getDireita();
					}
					else {
						atual.setDireita(novoNo);
						break;
					}
				}
			}
		}
	}
	
	public No<key> getRaiz(){
		return raiz;
	}
	
	public void PreOrdem(No<key> atual){
		if(atual != null) {
			System.out.print(atual.getValor()+", ");
			PreOrdem(atual.getEsquerda());
			PreOrdem(atual.getDireita());
		}
	}
	
	public void EmOrdem(No<key> atual) {
		if(atual!= null) {
			EmOrdem(atual.getEsquerda());
			System.out.print(atual.getValor()+", ");
			EmOrdem(atual.getDireita());
		}
	}
	
	public void PosOrdem(No<key> atual) {
		if(atual!= null) {
			PosOrdem(atual.getEsquerda());
			PosOrdem(atual.getDireita());
			System.out.println(atual.getValor()+", ");
		}
	}
	
	public boolean busca(Integer valor, boolean loc){
		No<key> aux = raiz;
		if(loc == false) {
			if((Integer)aux.getValor() == valor) {
				loc = true;
			}
			else if((Integer)aux.getValor() > valor) {
				valor = f aux.getEsquerda()
				busca(aux.getEsquerda());
			}
		}
		return loc;
	}
}
