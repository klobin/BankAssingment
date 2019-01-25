package edu.bank.service;

import edu.bank.domain.BankAccount;

public interface ValidationService {
	public boolean isPinCorrect(BankAccount accoutDetail, String pin) throws UnsupportedOperationException;
}
