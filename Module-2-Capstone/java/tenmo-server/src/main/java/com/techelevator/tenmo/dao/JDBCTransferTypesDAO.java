package com.techelevator.tenmo.dao;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.tenmo.model.TransferStatuses;
import com.techelevator.tenmo.model.TransferTypes;

public class JDBCTransferTypesDAO implements TransferTypesDAO{

	@Override
	public TransferTypes getTransferTypeById(Long id) {
		
		
		
		return null;
	}

	@Override
	public TransferTypes updateTransferType(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private TransferTypes mapRowToTransferTypes(SqlRowSet results) {
		TransferTypes transferTypesRow = new TransferTypes();
		transferTypesRow.setTransferTypes(results.getLong("transfer_type_id"));
		transferTypesRow.setTransferTypeDesc(results.getString("transfer_type_desc"));
        
        return transferTypesRow;
  }

}
