package teste;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, area1, a, b, c, a1, b1, c1, p, p1;
		
		System.out.println("digite as medidas do triangulo X: ");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		p = (a+b+c)/2;
		
		System.out.println("digite as medidas do triangulo y: ");
		
		a1 = sc.nextDouble();
		b1 = sc.nextDouble();
		c1 = sc.nextDouble();
		
		p1 = (a1+b1+c1)/2;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.printf("area do triangulo x: %.4f%n", area);
		area1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
		System.out.printf("area do triangulo y: %.4f%n", area1);
		System.out.print("maior area: ");
		if(area1>area)
			System.out.println("y");
		else
			System.out.println("x");
		sc.close();
	}
}
