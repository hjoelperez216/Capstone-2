package com.techelevator.tenmo.model;

public class Transfer_Statuses {
	
	private Long transfer_status_id;
	private String transfer_status_desc;
	
	public Transfer_Statuses(Long transfer_status_id, String transfer_status_desc) {
		this.transfer_status_id = transfer_status_id;
		this.transfer_status_desc = transfer_status_desc;
	}
		

	@Override
	public String toString() {
		return "transfer_statuses [transfer_status_id=" + transfer_status_id + ", transfer_status_desc="
				+ transfer_status_desc + "]";
	}


	public Long getTransfer_status_id() {
		return transfer_status_id;
	}

	public void setTransfer_status_id(Long transfer_status_id) {
		this.transfer_status_id = transfer_status_id;
	}

	public String getTransfer_status_desc() {
		return transfer_status_desc;
	}

	public void setTransfer_status_desc(String transfer_status_desc) {
		this.transfer_status_desc = transfer_status_desc;
	}
	
	

}
