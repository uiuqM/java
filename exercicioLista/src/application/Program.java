package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Criando a lista de funcionarios.
		List <Funcionario> listaFuncionario = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serao cadastrados?: ");
		int op = sc.nextInt();
		//preenchendo a lista conforme a qtd.
		for(int i = 0; i<op; i++) {
			System.out.printf("Funcionario %d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			//instanciando a classe funcionario.
			listaFuncionario.add(new Funcionario(id, nome, salario));
		}
		System.out.print("Digite o id do funcionario que vai receber aumento: ");
		int id = sc.nextInt();
		
		//para funcionario; x em listaFuncionario;
		for(Funcionario x : listaFuncionario) {
			if(x.getId() == id) {
				System.out.print("Digite o percentual a ser adicionado: ");
				double percentual = sc.nextDouble();
				x.aumentaSalario(percentual);
			}
			else {
				System.out.println("Esse ID nao existe!");
			}
		}
		System.out.println("Lista funcionarios: ");
		for(Funcionario x : listaFuncionario) {
			System.out.printf("ID: %d, nome: %s, salario: R$%.2f%n", x.getId(), x.getNome(), x.getSalario());
		}
		sc.close();
	}

}
