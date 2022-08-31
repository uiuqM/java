package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento(DD/MM/YYYY): ");
		Date nasc = sdf.parse(sc.next());
		Client cliente = new Client(nome, email, nasc);
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine(); 
		Order pedido = new Order(new Date(), OrderStatus.valueOf(status), cliente);
		System.out.print("Quantos items compoem o pedido?: ");
		Integer val = sc.nextInt();
		for(int i=0; i<val;i++) {
			sc.nextLine();
			System.out.println("Digite os dados do item "+(i+1)+":");
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			Product p1 = new Product(nomeProduto, precoProduto);
			OrderItem o1 = new OrderItem(quantidade, precoProduto, p1);
			pedido.addItem(o1);
		}
		System.out.println(pedido);
		
		sc.close();
	}

}
