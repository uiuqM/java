package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.nextLine();
		Produto[] array = new Produto[n];
		for(int i=0;i<n; i++) {
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			sc.nextLine();
			array[i] = new Produto(nome ,preco);
		}
		for(int i=0;i<n; i++) {
			System.out.printf("nome: %s, preco: %.2f%n", array[i].getNome(), array[i].getPreco());
		}
		sc.close();
	}

}
