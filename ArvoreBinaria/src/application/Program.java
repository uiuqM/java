package application;

import entities.ArvoreBinaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria<Integer> arv = new ArvoreBinaria<Integer>();
		arv.adiciona(9);
		arv.adiciona(1);
		arv.adiciona(3);
		arv.adiciona(5);
		arv.EmOrdem(arv.getRaiz());
		System.out.println(" ");
		arv.PreOrdem(arv.getRaiz());
		System.out.println(" ");
		arv.EmOrdem(arv.getRaiz());
	}

}
