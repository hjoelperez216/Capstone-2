package com.techelevator.tenmo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.tenmo.model.Transfers;

public class JDBCTransfersDAO implements TransfersDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCTransfersDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public List<Transfers> getAllTransfers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transfers> getAllTransfersTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transfers> getAllTransfersFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transfers getAmountFromAccount(Long transferId, int accountFrom, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transfers getAmountToAccount(Long transferId, int accountTo, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transfers create(Long transferId, int transferTypeId, int transferStatusId, int accountFrom, int accountTo,
			double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transfers getTransferByTransferId(Long TransferId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Transfers mapRowToTransfers(SqlRowSet results) {
		Transfers transfersRow = new Transfers();
		transfersRow.setTransferId(results.getLong("transfer_id"));
		transfersRow.setTransferTypeId(results.getInt("transfer_type_id"));
		transfersRow.setTransferStatusId(results.getInt("transer_status_id"));
		transfersRow.setAccountFrom(results.getInt("account_from"));
		transfersRow.setAccountTo(results.getInt("account_to"));
		transfersRow.setAmount(results.getDouble("amount"));
		
		return transfersRow;
		
	}

}
