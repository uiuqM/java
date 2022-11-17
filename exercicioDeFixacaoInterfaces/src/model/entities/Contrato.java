package model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer numero;
	private LocalDate data;
	private double valorCont;
	private List<Parcela> parcelas = new ArrayList<Parcela>();
	
	public Contrato(Integer numero, LocalDate data, double valorCont) {
		this.numero = numero;
		this.data = data;
		this.valorCont = valorCont;
	}
	
	public void addParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public LocalDate getData() {
		return data;
	}
	public double getValorCont() {
		return valorCont;
	}
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}
}
