package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dataParcela;
	private double total;
	
	public Parcela(LocalDate dataParcela, double total) {
		this.dataParcela = dataParcela;
		this.total = total;
	}
	
	public String toString() {
		return dataParcela.format(fmt) +" - "+String.format("%.2f", total);
	}
}
