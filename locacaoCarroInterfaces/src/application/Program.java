package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Locacao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Digite o modelo do carro: ");
		String carro = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyy HH:mm): ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retirada (dd/MM/yyy HH:mm): ");
		LocalDateTime entrega = LocalDateTime.parse(sc.nextLine(), fmt);
		
		Locacao loc = new Locacao(retirada, entrega, new Carro(carro));
		
		
		sc.close();
	}

}
