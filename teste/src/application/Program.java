package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Double> numeros = new ArrayList<>();
		numeros.add(2.3);
		numeros.add(2.6);
		numeros.add(2.4);
		numeros.add(2.2);
		for(Double x: numeros) {
			System.out.println(x);
		}
		System.out.println("ola java");
	}

}
