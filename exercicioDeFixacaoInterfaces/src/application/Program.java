package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.GeraContrato;
import model.services.ServicoPayPal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numeroParcelas = sc.nextInt();
		
		GeraContrato geraContrato = new GeraContrato(new ServicoPayPal());
		
		geraContrato.processa(contrato, numeroParcelas);
		
		System.out.println("Parcelas:");
		for(Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		sc.close();
	}

}
