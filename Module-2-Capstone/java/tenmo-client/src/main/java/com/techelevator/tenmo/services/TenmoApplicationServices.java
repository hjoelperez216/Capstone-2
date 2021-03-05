package com.techelevator.tenmo.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


import com.techelevator.tenmo.models.AuthenticatedUser;
import com.techelevator.tenmo.models.Transfers;

/*******************************************************************************************************
 * This is where you code Application Services required by your solution
 * 
 * Remember:  theApp ==> ApplicationServices  ==>  Controller  ==>  DAO
********************************************************************************************************/

public class TenmoApplicationServices {
	
	private AuthenticatedUser authUser;
	private String BASE_URL;
	private final RestTemplate restTemplate = new RestTemplate();
//	private ConsoleService consoleService = new ConsoleService(System.in, System.out);

	public TenmoApplicationServices(AuthenticatedUser authUser, String url) {
	    BASE_URL = url;
	    this.authUser = authUser;
	  }
	
	public Double getBalance() {
		double balance = 0;
		
		balance = restTemplate.exchange(BASE_URL + "balance/" + authUser.getUser().getId(), HttpMethod.GET, makeAuthEntity(), double.class).getBody();
		System.out.println("This is how broke you currently are: $" + balance);
		return balance;
	}
	
	
	
	
	
	
	
	 private HttpEntity<Transfers> makeTransfersEntity(Transfers transfers) {
		    HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON);
		    headers.setBearerAuth(authUser.getToken());
		    HttpEntity<Transfers> entity = new HttpEntity<>(transfers, headers);
		    return entity;
		  }
	 private HttpEntity makeAuthEntity() {
		    HttpHeaders headers = new HttpHeaders();        // instantiate a header object for request
		    headers.setBearerAuth(authUser.getToken());              // Set the "Bearer" attribute in the head for header to JWT
		                                                    // The "Bearer" attribute in a request header hold JWT
		     HttpEntity entity = new HttpEntity<>(headers);  // Create a properly formatted request by instantiating an entity
		    return entity;
		  }

}
