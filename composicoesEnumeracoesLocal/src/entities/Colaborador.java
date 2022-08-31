package entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Hierarquia;

public class Colaborador {
	private String nome;
	private Hierarquia nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Colaborador() {
	}
	public Colaborador(String nome, Hierarquia nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Hierarquia getNivel() {
		return nivel;
	}
	public void setNivel(Hierarquia nivel) {
		this.nivel = nivel;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<ContratoHora> getContratos() {
		return contratos;
	}
	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	public double ganho(int ano, int mes) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				sum += c.valorTotal();
			}
		}
		return sum;
	}
	
}
