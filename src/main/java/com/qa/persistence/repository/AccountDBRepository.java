package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.business.service.AccountService;
import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;
	
	public void createAccounts() {
		Account johnDoe = new Account("John","Doe","1234");
		Account janeDoe = new Account("Jane","Doe","1235");
		Account jimTaylor = new Account("Jim","Taylor","1236");

		manager.persist(util.getJSONForObject(johnDoe));
		manager.persist(util.getJSONForObject(janeDoe));
		manager.persist(util.getJSONForObject(jimTaylor));
	}

	
	@Override
	public String retrieveAccounts() {
		Query query = manager.createQuery("Select a From Account a");
		Collection<Account> result = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(result);
	}

	@Override
	public String addAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countFirstName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}
}
