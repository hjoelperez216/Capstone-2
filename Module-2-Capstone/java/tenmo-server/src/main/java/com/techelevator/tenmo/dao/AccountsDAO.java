package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Accounts;

public interface AccountsDAO {
	
	Accounts findAccountByUserId(Long user_Id);
	Accounts findAccountByAccountId(Long account_Id);
	Accounts getBalanceByUserId(Long user_Id);
	Accounts getBalanceByAccountId(Long user_Id);
	

}
