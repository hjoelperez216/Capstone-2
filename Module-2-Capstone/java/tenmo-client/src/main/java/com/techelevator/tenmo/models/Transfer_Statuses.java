package com.techelevator.tenmo.models;

public class Transfer_Statuses {

	private Long transfer_status_id;
	private String transfer_status_desc;
	
	public Transfer_Statuses(Long transfer_status_id, String transfer_status_desc) {
		this.transfer_status_id = transfer_status_id;
		this.transfer_status_desc = transfer_status_desc;
	}
	
	/**
	 * @return the transfer_status_id
	 */
	public Long getTransfer_status_id() {
		return transfer_status_id;
	}
	/**
	 * @param transfer_status_id the transfer_status_id to set
	 */
	public void setTransfer_status_id(Long transfer_status_id) {
		this.transfer_status_id = transfer_status_id;
	}
	/**
	 * @return the transfer_status_desc
	 */
	public String getTransfer_status_desc() {
		return transfer_status_desc;
	}
	/**
	 * @param transfer_status_desc the transfer_status_desc to set
	 */
	public void setTransfer_status_desc(String transfer_status_desc) {
		this.transfer_status_desc = transfer_status_desc;
	}
	@Override
	public String toString() {
		return "transfer_statuses [transfer_status_id=" + transfer_status_id + ", transfer_status_desc="
				+ transfer_status_desc + "]";
	}
	
	
}
