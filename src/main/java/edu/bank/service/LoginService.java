package edu.bank.service;

import java.util.List;

import edu.bank.domain.BankAccount;
import edu.bank.domain.LoginRequest;

public interface LoginService {
	public boolean isAccountNumberPresent(List<BankAccount> bankAccounts, List<LoginRequest> request);
}
