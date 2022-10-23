package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Progam {

	public static void main(String[] args) {
		/*File file = new File("C:\\Users\\wilqu\\Documents\\entradaJavaTeste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		--------Esse código lê o arquivo usando file e scanner.
		*/
		String caminho = "C:\\Users\\wilqu\\Documents\\entradaJavaTeste.txt";
		
		BufferedReader br = null; //Nesse usamos o br passando o caminho como stream
		FileReader fr = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		} finally{
			try {
				if(br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
