package application;
import java.util.Scanner;
import java.util.Locale;
import util.ConversorMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotacao do dolar atual?: ");
		double cotacao = sc.nextDouble();
		System.out.print("Qual o valor a ser comprado?: ");
		double valor = sc.nextDouble();
		
		System.out.printf("Valor em reais que voce precisa: R$%.2f", ConversorMoeda.operacao(cotacao, valor));
		
		sc.close();
	}

}
