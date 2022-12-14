package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		
		System.out.print("Digite o numero de produtos: ");
		Integer numProd = sc.nextInt();
		
		for(int i=0; i<numProd; i++) {
			System.out.printf("Digite os dados do produto %s\n", (i+1));
			System.out.print("Comum, usado ou importado?(c/u/i): ");
			char tipoProd = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			if(tipoProd == 'c') {
				Produto prod = new Produto(nome, preco);
				produtos.add(prod);
			}
			else if(tipoProd == 'u') {
				sc.nextLine();
				System.out.print("Data de producao: ");
				Date fabricacao = sdf.parse(sc.nextLine());
				Produto prodU = new ProdutoUsado(nome, preco, fabricacao);
				produtos.add(prodU);
			}
			else{
				System.out.print("Taxa alfandega: ");
				Double taxaAlfandega = sc.nextDouble();
				Produto prodI = new ProdutoImportado(nome, preco, taxaAlfandega);
				produtos.add(prodI);
			}
			System.out.println("TABELA PRECOS");
			
			for(Produto produto: produtos) {
				System.out.println(produto.etiqueta());
			}
		}
		
		sc.close();
	}

}
