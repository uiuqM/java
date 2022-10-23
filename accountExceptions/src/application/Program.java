package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite os dados da conta:");
			System.out.print("Numero:");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.println("Limite de saque: ");
			Double limite = sc.nextDouble();
			Account conta = new Account(num, nome, saldo, limite);
			System.out.print("Digite o valor do saque: ");
			Double valor = sc.nextDouble(); 
			conta.withdraw(valor);
			System.out.printf("Saldo atualizado: %.2f", conta.getBalance());
		}
		catch (DomainException e) {
			System.out.println("Erro no saque: "+e.getMessage());
		}
		sc.close();
		
	}

}
