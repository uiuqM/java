package triangulo_POO;
import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		
		double areaY = y.area();
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		System.out.print("Maior area: ");
		if(areaX>areaY)
			System.out.printf("%.4f%n", areaX);
		else
			System.out.printf("%.4f%n", areaY);
		sc.close();
	}
}
