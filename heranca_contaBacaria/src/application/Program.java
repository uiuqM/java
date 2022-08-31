package application;

import entities.Conta;
import entities.contaEmpresarial;
import entities.contaPoupanca;

public class Program {

	public static void main(String[] args) {
		Conta acc = new Conta(123, "murilo", 290.20);
		contaEmpresarial accEmp = new contaEmpresarial(189, "joao", 903.40, 400.0);
		
		//UPCASTING
		
		Conta acc1 = new contaEmpresarial(289, "marcelo", 89.3, 900.4);
		Conta acc3 = new contaPoupanca(894, "rodrigo", 983.9, 0.01);
		
		//DOWNCASTING
		
		contaEmpresarial acc2 = (contaEmpresarial)acc1;
		
		if(acc1 instanceof contaPoupanca) {
			//isso sera executado caso acc1 instancie objeto contaPoupanca
			contaPoupanca acc5 = (contaPoupanca)acc1;
		}
		else {
			System.out.println("Types cannot convert");
		}
	}

}
