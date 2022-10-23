package model.entities;

import model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance, withDrawLimit;
	
	public Account(Integer number, String holder, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withDrawLimit = withDrawLimit;
	}
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance +=amount;
	}
	
	public void withdraw(Double amount) {
		if(balance-amount<0.0){
			throw new DomainException("Nao ha saldo suficiente para o saque!");
		}
		if(amount>withDrawLimit) {
			throw new DomainException("O limite de saque nao permite um saque nesse valor!");
		}
		balance-=amount;
	}
}
