package model.entities;

import java.util.Date;

public class Parcela {
	private Date dataParcela;
	private double total;
	
	public Parcela(Date dataParcela, double total) {
		this.dataParcela = dataParcela;
		this.total = total;
	}
	
}
