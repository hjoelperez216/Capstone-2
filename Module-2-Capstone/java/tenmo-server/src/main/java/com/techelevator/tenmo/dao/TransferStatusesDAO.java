package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.TransferStatuses;

public interface TransferStatusesDAO {

	TransferStatuses getTransferStatusById(Long id);
	TransferStatuses updateTransferStatusById(Long id);
	
}
