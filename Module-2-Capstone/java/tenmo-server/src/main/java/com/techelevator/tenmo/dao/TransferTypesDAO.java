package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.TransferTypes;

public interface TransferTypesDAO {
	
	TransferTypes getTransferTypeById(Long id);
	TransferTypes updateTransferType(Long id);

}
