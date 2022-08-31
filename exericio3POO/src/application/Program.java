package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		
		aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.notaFinal();
		sc.close();
	}
}
