package com.techelevator.tenmo.dao;

import java.text.DecimalFormat;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.tenmo.model.Accounts;
import com.techelevator.tenmo.model.User;

@Component
public class JDBCAccountsDAO implements AccountsDAO {

	
	
	private JdbcTemplate jdbcTemplate;
	private DecimalFormat formatter = new DecimalFormat("0.00");
	
	public JDBCAccountsDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
//	public JDBCAccountsDAO(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
//	
	
	
	@Override
	public Accounts findAccountByUserId(Long userId) {
		String sql = "select * from accounts where user_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,userId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
		
//		return mapRowToAccounts(results);
	}

	@Override
	public Accounts findAccountByAccountId(Long accountId) {
		String sql = "select * from accounts where account_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,accountId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	

	@Override
	public Double getBalanceByUserId(Long userId) {
		String sql = "select * from accounts where user_id = ?";
		
		Double balance = null;
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,userId);
		if(results.next()) {
		balance = results.getDouble("balance");
		}
		return balance;
	}
	

	@Override
	public Accounts getBalanceByAccountId(Long accountId) {
		String sql = "select * from accounts where account_id = ?";
		
		SqlRowSet results =  jdbcTemplate.queryForRowSet(sql,accountId);
		if(results.next()) {
			return mapRowToAccounts(results);
		} else {
			return null;
		}
	}
	
	@Override
	public Accounts getBalanceByUsername(String username) {
		
		String sql = "select * "
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
