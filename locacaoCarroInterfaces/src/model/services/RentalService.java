package model.services;

import java.time.Duration;

import entities.Locacao;
import entities.Pagamento;

public class RentalService {
	private double pricePerDay, pricePerHour;
	private BrazilTaxService taxService;
	
	public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void ProcessInvoice(Locacao locCarro) {
		
		double minutes = Duration.between(locCarro.getInicio(), locCarro.getFim()).toMinutes();
		double hours = minutes/60.0;
		double basicPayment;
		if(hours<=12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		locCarro.setPagamento(new Pagamento(basicPayment, tax));
	}
}
