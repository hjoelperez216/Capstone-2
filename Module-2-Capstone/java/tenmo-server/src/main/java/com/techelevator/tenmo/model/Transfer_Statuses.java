package com.techelevator.tenmo.model;

public class Transfer_Statuses {
	
	private Long transferStatusId;
	private String transderStatusDesc;
	
	public Transfer_Statuses(Long transfer_status_id, String transfer_status_desc) {
		this.transferStatusId = transfer_status_id;
		this.transderStatusDesc = transfer_status_desc;
	}
		

	@Override
	public String toString() {
		return "transfer_statuses [transfer_status_id=" + transferStatusId + ", transfer_status_desc="
				+ transderStatusDesc + "]";
	}


	public Long getTransfer_status_id() {
		return transferStatusId;
	}

	public void setTransfer_status_id(Long transfer_status_id) {
		this.transferStatusId = transfer_status_id;
	}

	public String getTransfer_status_desc() {
		return transderStatusDesc;
	}

	public void setTransfer_status_desc(String transfer_status_desc) {
		this.transderStatusDesc = transfer_status_desc;
	}
	
	

}
