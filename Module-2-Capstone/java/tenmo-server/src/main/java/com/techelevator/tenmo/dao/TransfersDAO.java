package com.techelevator.tenmo.dao;

import java.util.List;

import com.techelevator.tenmo.model.Transfers;

public interface TransfersDAO {
          List<Transfers>getAllTransfers();
          List<Transfers>getAllTransfersTo();
          List<Transfers>getAllTransfersFrom();
          Transfers getAmountFromAccount(Long transferId,int accountFrom,double amount);
          Transfers getAmountToAccount(Long transferId,int accountTo,double amount);
          Transfers create(Long transferId,int transferTypeId,int transferStatusId,int accountFrom,int accountTo,double amount);
          Transfers getTransferByTransferId(Long TransferId);
          
}
