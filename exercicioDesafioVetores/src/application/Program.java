package application;
import java.util.Scanner;
import java.util.Locale;
import entiities.enquilino;

public class Program {

	public static int MAX = 10;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int qtd = sc.nextInt();
		enquilino[] qtdAluguel = new enquilino[MAX];
		
		for(int i = 0; i<qtd; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite o email: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto: ");
			int num = sc.nextInt();
			qtdAluguel[num] = new enquilino(nome, email, num);
		}
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i<MAX; i++) {
			if(qtdAluguel[i] != null)
				System.out.printf("#quarto: %d; nome: %s, email: %s%n", qtdAluguel[i].getQuarto(), qtdAluguel[i].getNome(), qtdAluguel[i].getEmail());
		}
		
		sc.close();
	}

}
