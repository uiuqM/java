package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List <Pessoa> pessoas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de pagadores: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do pagador #"+(i+1));
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Pessoa fisica ou juridica?(f/j): ");
			char tipo = sc.next().charAt(0);
			System.out.print("Digite o ganho anual: ");
			Double renda = sc.nextDouble();
			if(tipo == 'f') {
				System.out.print("Despesas medicas: ");
				Double despesas = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, renda, despesas));
			}
			else {
				System.out.print("Quantidade de funcionarios: ");
				Integer numFunc = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, renda, numFunc));
			}
		}
		System.out.println("Taxas Pagas:");
		Double sum = 0.0;
		for(Pessoa pessoa: pessoas) {
			sum += pessoa.calculaImposto();
			System.out.println(pessoa);
		}
		System.out.printf("Total de taxas: %.2f", sum);
		sc.close();
	}

}
