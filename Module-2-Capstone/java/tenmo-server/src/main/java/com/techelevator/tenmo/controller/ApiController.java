package com.techelevator.tenmo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.validation.Valid;

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
import com.techelevator.tenmo.model.User;

/*******************************************************************************************************
 * This is where you code any API controllers you may create
********************************************************************************************************/
@RestController
public class ApiController {

	private AccountsDAO accountsDAO;
	private TransfersDAO transfersDAO;
	private UserDAO userDAO;
	private static final String BASE_URL = "http://localhost:8080";


	
	public ApiController(AccountsDAO accountsDAO, TransfersDAO transfersDAO, UserDAO userDAO) {
		this.accountsDAO = accountsDAO;
		this.transfersDAO = transfersDAO;
		this.userDAO = userDAO;
	}

	
	

	//Accounts
//-----------------------------------------------------------------------------------------------
	@PreAuthorize("permitAll()")
	@RequestMapping(path ="/accounts/user/{userId}", method=RequestMethod.GET)
	public Accounts findAccountByUserId(@PathVariable Long userId) {
		
//		logAPICall("Called with path");
		
		return accountsDAO.findAccountByUserId(userId);	
	}
	@PreAuthorize("permitAll()")
	@RequestMapping(path="/accounts/account/{accountId}", method=RequestMethod.GET)
	public Accounts findAccountByAccountId(@PathVariable Long accountId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.findAccountByAccountId(accountId);
	}
	
	@RequestMapping(path="/accounts/user/{userId}/balance", method=RequestMethod.GET)
	public Double getBalanceByUserId(@PathVariable Long userId) {
		
		logAPICall("Called with path");
		
		return accountsDAO.getBalanceByUserId(userId);
	}
	
	@RequestMapping(path="/balance/{userId}", method=RequestMethod.GET)
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
	
	@RequestMapping(path="/accounts/transfers/username/{amount}", method=RequestMethod.GET)
	public Transfers getAmountFromAccount(@PathVariable String username, double amount) {
		
		logAPICall("Called with path");

		return transfersDAO.getAmountFromAccount(username, amount);
		
	}
	
	@RequestMapping(path="/accounts/{username}/new_transfer", method=RequestMethod.POST)
	public Transfers create(@RequestBody Long transferId, int transferStatusId, int accountFrom, int accountTo, double amount,
							@PathVariable("username") String username) {
		
		logAPICall("Called with path");

		
		return transfersDAO.create(transferId, transferStatusId, accountFrom, accountTo, accountTo, amount);
	}
	
	@RequestMapping(path="/account/transfers/{transferId}", method=RequestMethod.GET)
	public Transfers getTransferByTransferId(@PathVariable Long transferId) {
		
		logAPICall("Called with path");

		return transfersDAO.getTransferByTransferId(transferId);
	}
	
	@RequestMapping(path="/account/transfers/transferId/{type}", method=RequestMethod.GET)
	public Transfers getTransferType(@PathVariable Long transferId) {
		
		logAPICall("Called with path");

		return transfersDAO.getTransferType(transferId);
	}	
	
	@RequestMapping(path="/account/transfers/transferId/status/{transferStatusId}", method=RequestMethod.GET)
	public Transfers getStatus(@PathVariable Long transferStatusId) {
		
		logAPICall("Called with path");

		return transfersDAO.getStatus(transferStatusId);
	}	
	
	
	//Users
//-----------------------------------------------------------------------------------------------	
			
	@RequestMapping(path = "/user/{username}", method=RequestMethod.GET)
	public User findByUsername(@PathVariable String username) {
		
		logAPICall("Called with path");

		
		return userDAO.findByUsername(username);
		
	}
	
	@RequestMapping(path= "/user/{username}/id", method=RequestMethod.GET)
	public int findIdByUsername(@PathVariable String username) {
		
		logAPICall("Called with path");

		
		return userDAO.findIdByUsername(username);
	}
	
	@RequestMapping(path="/user/create", method=RequestMethod.POST)
	public boolean create(@RequestBody String username, String password) {
		
		logAPICall("Called with path");

		
		return userDAO.create(username, password);
	}
	

	
public void logAPICall(String message) {	  //Write a message with a timestamp to the server log
		 LocalDateTime now = LocalDateTime.now(); 
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss.A");
	     String timeNow = now.format(formatter);
	     System.out.println(timeNow + "-" + message);
	 }	
	
	
}
