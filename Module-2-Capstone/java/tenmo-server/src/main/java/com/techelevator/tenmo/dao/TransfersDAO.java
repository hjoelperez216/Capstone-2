package com.techelevator.tenmo.dao;

import java.util.List;

import com.techelevator.tenmo.model.Transfers;

public interface TransfersDAO {
          List<Transfers>getAllTransfers(String username);
          List<Transfers>getAllTransfersTo();
          List<Transfers>getAllTransfersFrom();
          Transfers getAmountFromAccount(String username,double amount);
          Transfers getAmountToAccount(Long transferId,int accountTo,double amount);
          Transfers create(Long transferId,int transferTypeId,int transferStatusId,int accountFrom,int accountTo,double amount);
          Transfers getTransferByTransferId(Long TransferId);
          Transfers getTransferType(Long transferId);
          Transfers getStatus(Long transferId);
}
