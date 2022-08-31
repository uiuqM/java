package application;
import java.util.Scanner;
import java.util.Locale;
import entities.contaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		contaBancaria c1;
		
		System.out.print("Digite o numero da conta para cadastro: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do titular da conta para cadastro: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito inicial?[S/N]: ");
		char op = sc.next().charAt(0);
		
		if(op =='S') {
			System.out.print("Digite o valor a ser depositado: ");
			double deposito = sc.nextDouble();
			c1 = new contaBancaria(numero, nome, deposito);
		}
		else {
			c1 = new contaBancaria(numero , nome);
		}
		System.out.printf("numero: %d, titular: %s, R$%.2f%n", c1.getNumeroConta(), c1.getNome(), c1.getSaldo());
		System.out.print("Digite o valor de um novo deposito: ");
		double valor = sc.nextDouble();
		
		c1.deposito(valor);
		
		System.out.printf("numero: %d, titular: %s, R$%.2f%n", c1.getNumeroConta(), c1.getNome(), c1.getSaldo());
		
		System.out.print("Digite o valor de um saque: ");
		valor = sc.nextDouble();
		
		c1.saque(valor);
		System.out.printf("numero: %d, titular: %s, R$%.2f%n", c1.getNumeroConta(), c1.getNome(), c1.getSaldo());
		
		sc.close();
	}

}
