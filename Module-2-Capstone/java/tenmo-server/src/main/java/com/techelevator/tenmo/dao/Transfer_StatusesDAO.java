package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer_Statuses;

public interface Transfer_StatusesDAO {

	Transfer_Statuses getTransferStatusById(Long id);
	Transfer_Statuses updateTransferStatusById(Long id);
	
}
