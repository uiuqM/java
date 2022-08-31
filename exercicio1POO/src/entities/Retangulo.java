package entities;

public class Retangulo {
	public double largura, altura;
	
	public double area() {
		return largura*altura;
	}
	
	public double perimetro() {
		return largura*2+altura*2;
	}
	
	public double diagonal() {
		if(largura == altura)
			return altura*Math.sqrt(2);
		else
			return Math.sqrt((Math.pow(altura, 2)+Math.pow(largura, 2)));
	}
}
