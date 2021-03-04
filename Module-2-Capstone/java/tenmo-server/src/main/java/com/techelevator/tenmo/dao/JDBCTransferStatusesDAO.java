package com.techelevator.tenmo.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import com.techelevator.tenmo.model.TransferStatuses;

public class JDBCTransferStatusesDAO implements TransferStatusesDAO {

private JdbcTemplate jdbcTemplate;
	
	public JDBCTransferStatusesDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public TransferStatuses getTransferStatusById(Long id) {
		String sql = "select transfer_type_desc from transfer_types where transfer_type_id =?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		
		if(results.next()) {
			return mapRowToTransferStatuses(results);
		} else {
			return null;
		}
		
	}

	@Override
	public TransferStatuses updateTransferStatusById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private TransferStatuses mapRowToTransferStatuses(SqlRowSet results) {
		TransferStatuses transferStatusRow = new TransferStatuses();
		transferStatusRow.setTransferStatusId(results.getLong("transfer_status_id"));
		transferStatusRow.setTransderStatusDesc(results.getString("transfer_status_desc"));
        
        return transferStatusRow;
  }
	

}
