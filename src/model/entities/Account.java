package model.entities;
import exception.WithdrawException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
		
	public void withdraw(double withdraw) throws WithdrawException {
		if(withdraw > withdrawLimit) {
			throw new WithdrawException();
		}
		
		if(withdraw > balance) {
			throw new WithdrawException("Error: saldo insuficiente!");
		}
		
		balance -= withdraw;
	}
	
}
