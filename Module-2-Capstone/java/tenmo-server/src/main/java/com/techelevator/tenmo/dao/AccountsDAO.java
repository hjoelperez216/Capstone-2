package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Accounts;

public interface AccountsDAO {
	
	Accounts findAccountByUserId(Long userId);
	Accounts findAccountByAccountId(Long accountId);
	Accounts getBalanceByUserId(Long userId);
	Accounts getBalanceByAccountId(Long userId);
	Accounts getBalanceByUsername(String username);
	

}
