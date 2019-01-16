package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.AccountService;

@Path("/account")
public class AccountEndpoint {
	
	@Inject
	private AccountService service;

	@Path("/getAllAccounts/{accNo}")
	@GET
	@Produces({ "application/json" })
	public String retrieveAccount(@PathParam("accNo") int accNo) {
		return service.retrieveAccount(accNo);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	
	@Path("/countFirstName/{name}")
	@GET
	@Produces({ "application/json" })
	public int countFirstName(@PathParam("name") String name) {
		return service.countFirstName(name);
	}


		public void setService(AccountService service) {
		this.service = service;
	}

}
