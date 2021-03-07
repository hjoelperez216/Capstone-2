package com.techelevator.tenmo.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


import com.techelevator.tenmo.models.AuthenticatedUser;
import com.techelevator.tenmo.models.Transfers;
import com.techelevator.tenmo.models.User;
import com.techelevator.view.ConsoleService;

/*******************************************************************************************************
 * This is where you code Application Services required by your solution
 * 
 * Remember:  theApp ==> ApplicationServices  ==>  Controller  ==>  DAO
********************************************************************************************************/

public class TenmoApplicationServices {
	
	private AuthenticatedUser authUser;
	private String BASE_URL;
	private final RestTemplate restTemplate = new RestTemplate();
	
	private ConsoleService consoleService = new ConsoleService(System.in, System.out);

	public TenmoApplicationServices(String url) {
	    BASE_URL = url;
	 
	  }
	
	public double getBalance(AuthenticatedUser authUser) {
		double balance = 0;
		balance = restTemplate.exchange(BASE_URL + "balance/" + authUser.getUser().getId(), HttpMethod.GET, makeAuthEntity(authUser), Double.class).getBody();
		System.out.println("This is how broke you currently are: $" + balance);
		return balance;
	}
	
	public double addBalance(double add, Long id) {
		double balance = 0;
		balance = restTemplate.exchange(BASE_URL + "balance/" + authUser.getUser().getId(), HttpMethod.GET, makeAuthEntity(authUser), Double.class).getBody();
		balance += add;
		return balance;
	}
	
	public Transfers[] listTransfers(AuthenticatedUser authUser) {
		Transfers[] transfers;
		transfers = restTemplate.exchange(BASE_URL + "accounts/transfers/" + authUser.getUser().getUsername(), HttpMethod.GET, makeAuthEntity(authUser), Transfers[].class).getBody();
		for(Transfers theTransfers : transfers) {
			System.out.println("Transfers:     " +theTransfers.toString());
		}
		return transfers;
	}
	
	public void sendAmount (AuthenticatedUser authUser) {
		User[] users;
		Transfers transfer = new Transfers();
		users = restTemplate.exchange(BASE_URL + "users", HttpMethod.GET, makeAuthEntity(authUser), User[].class).getBody();
		for(User i : users) {
			if(i.getId() != authUser.getUser().getId()) {
				System.out.println(i.getId() + ": " + i.getUsername());
			}
		}
		transfer.setAccount_to(Long.parseLong(consoleService.getUserInput("Enter account ID to send $$: ")));
		transfer.setAccount_from(authUser.getUser().getId());
		
		transfer.setAmount(consoleService.getUserInputInteger("Enter amount:"));
		String out = restTemplate.exchange(BASE_URL + "new_transfer", HttpMethod.POST, makeTransfersEntity(transfer, authUser), String.class).getBody();
		System.out.print(out);
	}
	
	
	public User[] getUsers(AuthenticatedUser user) {
		User[] users;
		users = restTemplate.exchange(BASE_URL + "users", HttpMethod.GET, makeAuthEntity(authUser), User[].class).getBody();
		for (User i : users) {
			System.out.println(i);
		}
		return users;
	}
	
	
	
	
	
	
	 private HttpEntity<Transfers> makeTransfersEntity(Transfers transfers, AuthenticatedUser authUser) {
		    HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON);
		    headers.setBearerAuth(authUser.getToken());
		    HttpEntity<Transfers> entity = new HttpEntity<>(transfers, headers);
		    return entity;
		  }
	 private HttpEntity makeAuthEntity(AuthenticatedUser authUser) {
		    HttpHeaders headers = new HttpHeaders();        // instantiate a header object for request
		    headers.setBearerAuth(authUser.getToken());              // Set the "Bearer" attribute in the head for header to JWT
		                                                    // The "Bearer" attribute in a request header hold JWT
		     HttpEntity entity = new HttpEntity<>(headers);  // Create a properly formatted request by instantiating an entity
		    return entity;
		  }

}
