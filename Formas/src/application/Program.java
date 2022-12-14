package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Shape> areaFormas = new ArrayList<>();
		
		System.out.print("Digite o numero de formas: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite os dados da forma #"+ (i+1));
			System.out.print("Retangulo ou circulo?(r/c): ");
			char esc = sc.nextLine().charAt(0);
			System.out.print("COR(BLACK/BLUE/RED): ");
			String cor = sc.nextLine();
			if(esc == 'r') {
				System.out.print("Digite a altura: ");
				Double alt = sc.nextDouble();
				System.out.print("Digite a largura: ");
				Double larg = sc.nextDouble();
				areaFormas.add(new Rectangle(Color.valueOf(cor), alt, larg));
			}
			else {
				System.out.print("Digite o raio: ");
				Double raio = sc.nextDouble();
				areaFormas.add(new Circle(Color.valueOf(cor), raio));
			}
		}
		
		System.out.println("Areas: ");
		
		for (Shape forma: areaFormas) {
			System.out.printf("%.2f\n", forma.area());
		}
			
		
		
		sc.close();
	}

}
