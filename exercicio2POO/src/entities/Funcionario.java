package entities;

public class Funcionario {
	public String nome;
	public double imposto, salarioBruto;
	
	public double salarioLiquido() {
		return salarioBruto -=imposto;
	}
	
	public void aumentaSalario(double porcentagem) {
		 salarioBruto = (salarioBruto * (porcentagem+100.0))/100.0;
	}
	
	//especificando o retorno do object com o toString.
	public String toString() {
		return "Funcionario: "+nome+
				", R$"+String.format("%.2f", salarioLiquido());
	}
}
