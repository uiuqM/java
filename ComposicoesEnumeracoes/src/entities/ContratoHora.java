package entities;

import java.time.LocalDate;

public class ContratoHora {
	private LocalDate data;
	private Double valorHora;
	private Integer hora;
	
	public ContratoHora() {
	}
	public ContratoHora(LocalDate data, Double valorHora, Integer hora) {
		this.data = data;
		this.valorHora = valorHora;
		this.hora = hora;
	}
	public LocalDate getData() {
		return data;
	}
	public Double getValorHora() {
		return valorHora;
	}
	public Integer getHora() {
		return hora;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Double valorTotal() {
		return valorHora*hora;
	}
}
