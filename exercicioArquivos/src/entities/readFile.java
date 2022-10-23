package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile {
	String caminho;
	public readFile(String caminho) {
		
		this.caminho = caminho;

		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
		
			String linha = br.readLine();
			String[] pos = null;
			List<String> nomes = new ArrayList<>();
			List<Double> valores = new ArrayList<>();
			while(linha != null) {
				System.out.println(linha);
				pos = linha.split(",");
				nomes.add(pos[0]);
				valores.add(Double.parseDouble(pos[1])*Double.parseDouble(pos[2]));
				linha = br.readLine();
			}
			for(String nome : nomes) {
				for(Double valor : valores) {
					System.out.println(nome+","+ valor);
					break;
				}
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
