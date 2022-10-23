package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String path = "D:\\documents\\exercicio\\in.csv";
		
		String outputPath = "D:\\documents\\exercicio\\out\\summary.csv";

		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))){
			
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
					bw.write(nome+","+valor);
					bw.newLine();
					valores.remove(valor);
					break;
				}
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
