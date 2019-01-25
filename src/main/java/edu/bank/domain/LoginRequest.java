package edu.bank.domain;

public class LoginRequest {
	private int accountNumber;
	private String pin;

	public LoginRequest(int accountNumber, String pin) {
		super();
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getPin() {
		return pin;
	}

}
