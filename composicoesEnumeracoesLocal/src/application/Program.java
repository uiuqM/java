package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Colaborador;
import entities.ContratoHora;
import entities.Departamento;
import entities.enums.Hierarquia;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Digite os dados do colaborador: ");
		System.out.print("Nome: ");
		String nomeColaborador = sc.nextLine();
		System.out.print("Nivel: ");
		String colaboradorNivel = sc.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();
		Colaborador colaborador1 = new Colaborador(nomeColaborador, Hierarquia.valueOf(colaboradorNivel), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos serao adicionados?: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("Digite os dados do contrato #"+(i+1));
			System.out.print("DATA (DD/MM/YYYY): ");
			Date dataDeContrato = sdf.parse(sc.next());
			System.out.print("Digite o ganho por hora do contrato: ");
			double valorHora = sc.nextDouble();
			System.out.print("Digite a quantidade de horas: ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataDeContrato, valorHora, horas);
			colaborador1.addContrato(contrato);
		}
		System.out.println();
		System.out.println("Digite o mes e ano para calcular o ganho (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("nome: "+colaborador1.getNome());
		System.out.println("Departamento: "+colaborador1.getDepartamento().getNome());
		System.out.println("Ganho para "+mesAno+": "+String.format("%.2f", colaborador1.ganho(ano, mes)));
		sc.close();
	}

}
