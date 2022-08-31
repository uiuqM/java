package entities;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public void notaFinal() {
		double notaFinal = nota1+nota2+nota3;
		System.out.printf("FINAL GRADE: %.2f%n", notaFinal);
		if(notaFinal>=60)
			System.out.println("PASS");
		else {
			System.out.println("FAILED");
			notaFinal =60.0-notaFinal;
			System.out.printf("MISSING: %.2f POINTS", notaFinal);
		}
	}
}
