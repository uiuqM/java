package application;
import java.util.Scanner;
import java.util.Locale;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		for(int i = 0; i<n ; i++) {
			System.out.print("Digite um numero: ");
			double aux = sc.nextDouble();
			if(aux<0)
				array[i] = aux;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for(int i = 0; i<n ; i++) {
			if(array[i]!=0)
				System.out.printf("%.2f%n", array[i]);			
		}
		
		sc.close();
	}

}
