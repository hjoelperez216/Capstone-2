package com.techelevator.tenmo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.tenmo.model.Accounts;
import com.techelevator.tenmo.model.User;

public class JDBCAccountsDAO implements AccountsDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCAccountsDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public Accounts findAccountByUserId(Long userId) {
		String sql = "select * from accounts where user_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,userId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}

	@Override
	public Accounts findAccountByAccountId(Long accountId) {
		String sql = "select account_id from accounts where account_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,accountId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	

	@Override
	public Accounts getBalanceByUserId(Long userId) {
		String sql = "select balance from accounts where user_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,userId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	

	@Override
	public Accounts getBalanceByAccountId(Long accountId) {
		String sql = "select balance from accounts where account_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,accountId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	
	@Override
	public Accounts getBalanceByUsername(String username) {
		
		String sql = "select balance "
				   + "from users "
				   + "join accounts "
				   + "on accounts.user_id = users.user_id "
				   + "where username = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, username);
		
		
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	
	  private Accounts mapRowToAccounts(SqlRowSet results) {
	        Accounts accountRow = new Accounts();
	        accountRow.setAccountId(results.getLong("account_id")); 
	        accountRow.setUserId(results.getInt("user_id"));
	        accountRow.setBalance(results.getDouble("balance"));
	        return accountRow;
	  }

}
