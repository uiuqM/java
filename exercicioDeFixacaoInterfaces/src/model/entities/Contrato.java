package model.entities;

import java.util.Date;

public class Contrato{
	private Integer numero;
	private Date data;
	private double valorCont;
	
	public Contrato(Integer numero, Date data, double valorCont) {
		this.numero = numero;
		this.data = data;
		this.valorCont = valorCont;
	}
	
	public Date getData() {
		return data;
	}
	public double getValorCont() {
		return valorCont;
	}
}
