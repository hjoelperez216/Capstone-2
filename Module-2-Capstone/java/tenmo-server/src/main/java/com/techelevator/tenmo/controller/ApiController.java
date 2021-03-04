package com.techelevator.tenmo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.tenmo.dao.AccountsDAO;
import com.techelevator.tenmo.dao.JDBCAccountsDAO;
import com.techelevator.tenmo.dao.JDBCTransfersDAO;
import com.techelevator.tenmo.dao.TransfersDAO;
import com.techelevator.tenmo.dao.UserDAO;
import com.techelevator.tenmo.dao.UserSqlDAO;
import com.techelevator.tenmo.model.Accounts;
import com.techelevator.tenmo.model.Transfers;

/*******************************************************************************************************
 * This is where you code any API controllers you may create
********************************************************************************************************/
@RestController
public class ApiController {

	private AccountsDAO accountsDAO;
	private TransfersDAO transfersDAO;
	private UserDAO userDAO;
	private static final String BASE_URL = "http://localhost:8080";
	
	public ApiController() {
		this.accountsDAO = accountsDAO;
		this.transfersDAO = transfersDAO;
		this.userDAO = userDAO;
	}


	//Accounts
//-----------------------------------------------------------------------------------------------
	@PreAuthorize("permitAll()")
	@RequestMapping(path =BASE_URL+"/accounts/user/{id}", method=RequestMethod.GET)
	public Accounts findAccountByUserId(@PathVariable Long userId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.findAccountByUserId(userId);	
	}
	
	@RequestMapping(path="/accounts/account/{id}", method=RequestMethod.GET)
	public Accounts findAccountByAccountId(@PathVariable Long accountId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.findAccountByAccountId(accountId);
	}
	
	@RequestMapping(path="/accounts/user/{id}/balance", method=RequestMethod.GET)
	public Accounts getBalanceByUserId(@PathVariable Long userId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.getBalanceByUserId(userId);
	}
	
	@RequestMapping(path="/accounts/account/{id}/balance", method=RequestMethod.GET)
	public Accounts getBalanceByAccountId(@PathVariable Long userId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.getBalanceByAccountId(userId);
	}	
	
	@RequestMapping(path="/accounts/{username}/balance", method=RequestMethod.GET)
	public Accounts getBalanceByUsername(@PathVariable String username) {
		
		logAPICall("Called with path");
		
		return accountsDAO.getBalanceByUsername(username);
	}

	
	//Transfers
//-----------------------------------------------------------------------------------------------	
	
	@RequestMapping(path="/accounts/transfers/{username}", method=RequestMethod.GET)
	public List<Transfers> getAllTransfers(@PathVariable String username) {
		
		List<Transfers> theTransfers;
		
		theTransfers = transfersDAO.getAllTransfers(username);
		
		logAPICall("Called with path");
		
		return theTransfers;
	}
	
	@RequestMapping(path="accounts/transfers/username/{amount}", method=RequestMethod.GET)
	public Transfers getAmountFromAccount(@PathVariable String username, double amount) {
		
		logAPICall("Called with path");

		return transfersDAO.getAmountFromAccount(username, amount);
		
	}
	
	@RequestMapping(path="accounts/{username}/new_transfer", method=RequestMethod.POST)
	public Transfers create(@RequestBody Long transferId, int transferStatusId, int accountFrom, int accountTo, double amount,
							@PathVariable("username") String username) {
		
		logAPICall("Called with path");

		
		return transfersDAO.create(transferId, transferStatusId, accountFrom, accountTo, accountTo, amount);
	}
	
	@RequestMapping(path="account/transfers/{transferId}", method=RequestMethod.GET)
	public Transfers getTransferByTransferId(@PathVariable Long transferId) {
		
		logAPICall("Called with path");

		return transfersDAO.getTransferByTransferId(transferId);
	}
	
	@RequestMapping(path="account/transfers/transferId/{type}", method=RequestMethod.GET)
	public Transfers getTransferType(@PathVariable Long transferId) {
		
		logAPICall("Called with path");

		return transfersDAO.getTransferType(transferId);
	}	
	
	@RequestMapping(path="account/transfers/transferId/{transfer_status}", method=RequestMethod.GET)
	public Transfers getStatus(@PathVariable Long transferId) {
		
		logAPICall("Called with path");

		return transfersDAO.getStatus(transferId);
	}	
	
	
	//Users
//-----------------------------------------------------------------------------------------------	
			
	
	
	
	
	

	
	
public void logAPICall(String message) {	  //Write a message with a timestamp to the server log
		 LocalDateTime now = LocalDateTime.now(); 
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss.A");
	     String timeNow = now.format(formatter);
	     System.out.println(timeNow + "-" + message);
	 }	
	
	
}
