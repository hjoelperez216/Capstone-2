package com.techelevator.tenmo.model;

public class TransferStatuses {
	
	private Long transferStatusId;
	private String transferStatusDesc;
	
	public TransferStatuses() {
		this.transferStatusId = transferStatusId;
		this.transferStatusDesc = transferStatusDesc;
	}

	public Long getTransferStatusId() {
		return transferStatusId;
	}

	public void setTransferStatusId(Long transferStatusId) {
		this.transferStatusId = transferStatusId;
	}

	public String getTransderStatusDesc() {
		return transferStatusDesc;
	}

	public void setTransderStatusDesc(String transderStatusDesc) {
		this.transferStatusDesc = transderStatusDesc;
	}

	@Override
	public String toString() {
		return "TransferStatuses [transferStatusId=" + transferStatusId + ", transderStatusDesc=" + transferStatusDesc
				+ "]";
	}
		


	
	

}
