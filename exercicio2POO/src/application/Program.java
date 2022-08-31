package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double aumento;
		
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		//Já usando o toString
		System.out.println(funcionario);
		
		System.out.print("Qual percentual de aumento do salario?: ");
		aumento = sc.nextDouble();
		funcionario.aumentaSalario(aumento);
		
		System.out.println(funcionario);
		
		sc.close();
	}

}
