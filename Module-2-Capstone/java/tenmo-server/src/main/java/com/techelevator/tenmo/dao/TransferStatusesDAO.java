package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer_Statuses;

public interface TransferStatusesDAO {

	Transfer_Statuses getTransferStatusById(Long id);
	Transfer_Statuses updateTransferStatusById(Long id);
	
}
