package entities;

import java.time.LocalDateTime;

public class Locacao {
	private LocalDateTime inicio, fim;
	private Carro carro;
	private Pagamento pagamento;
	
	public Locacao(LocalDateTime inicio, LocalDateTime fim, Carro carro) {
		this.inicio = inicio;
		this.fim = fim;
		this.carro = carro;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
