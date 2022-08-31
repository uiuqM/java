package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Funcionario>funcionarios = new ArrayList<>(); 
		System.out.print("Digite o numero de funcionarios: ");
		int numFunc = sc.nextInt();
		
		for(int i = 0; i<numFunc; i++) {
			System.out.printf("Digite os dados do #%d funcionario\n", (i+1));
			System.out.print("Funcionario terceirizado?(S/N) ");
			char aux = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor da hora: ");
			Double valorHora = sc.nextDouble();
			Funcionario func = new Funcionario(nome, horas, valorHora);
			funcionarios.add(func);
			if(aux == 'S') {
				sc.nextLine();
				System.out.print("Despesa adicional: ");
				Double despesaAdicional = sc.nextDouble();
				Funcionario funcT = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
				funcionarios.add(funcT);
			}
		}
		System.out.println("PAGAMENTOS: ");
		for (Funcionario func : funcionarios) {
			System.out.println(func.getNome()+" - R$"+func.pagamento());
		}
		
		sc.close();
	}

}
