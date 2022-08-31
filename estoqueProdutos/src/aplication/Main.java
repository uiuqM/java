package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		// Esse locale aqui é pra fazer a leitura do double com . ao inves de ,
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto1;
		int aux;
		produto1 = new Produto(); //essa instaciacao é a default do java(sem construtor especifico).
		
		System.out.println("Digite os dados:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		//instaciando conforme o construtor que foi elaborado p objeto.
		Produto produto = new Produto(nome, preco, quantidade);
		
		//Esse é pra testar o retorno toString do Object Produto.
		System.out.println(produto);
		
		System.out.print("Digite o valor para adicionar ao estoque: ");
		aux = sc.nextInt();
		produto.adicionarProduto(aux);
		System.out.println(produto);
		
		System.out.print("Digite o valor para retirar do estoque: ");
		aux = sc.nextInt();
		produto.removerProduto(aux);
		System.out.println(produto);
		
		sc.close();
	}

}
