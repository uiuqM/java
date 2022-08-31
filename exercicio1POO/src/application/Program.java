package application;
import java.util.Scanner;
import entities.Retangulo;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo;
		retangulo = new Retangulo();
		
		System.out.println("Digite a altura e largura do quadrado/retangulo: ");
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retangulo.area());
		
		System.out.printf("PERIMETRO: %.2f%n", retangulo.perimetro());
		
		System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
