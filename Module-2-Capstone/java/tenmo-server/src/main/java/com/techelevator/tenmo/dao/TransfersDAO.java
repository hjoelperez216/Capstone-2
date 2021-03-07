package com.techelevator.tenmo.dao;

import java.util.List;

import com.techelevator.tenmo.model.Transfers;

public interface TransfersDAO {
          List<Transfers>getAllTransfers(String username);
          List<Transfers>getAllTransfersTo();	//not used
          List<Transfers>getAllTransfersFrom(); //not used
          String sendAmount(Long sender, Long receiver, double amount);
          Transfers requestAmount(Long transferId,int accountTo,double amount); //not used
          Transfers create(Long transferId,int transferTypeId,int transferStatusId,int accountFrom,int accountTo,double amount);
          Transfers getTransferByTransferId(Long TransferId);
          Transfers getTransferType(Long transferId);
          Transfers getStatus(Long transferId);
         
}
