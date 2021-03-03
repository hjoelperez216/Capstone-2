package com.techelevator.tenmo.models;

public class Transfer_Types {
	
	private Long transfer_types;
	private String transfer_type_desc;
	
	public Transfer_Types(Long transfer_types, String transfer_type_desc) {
		this.transfer_types = transfer_types;
		this.transfer_type_desc = transfer_type_desc;
	}
	
	/**
	 * @return the transfer_types
	 */
	public Long getTransfer_types() {
		return transfer_types;
	}
	/**
	 * @param transfer_types the transfer_types to set
	 */
	public void setTransfer_types(Long transfer_types) {
		this.transfer_types = transfer_types;
	}
	/**
	 * @return the transfer_type_desc
	 */
	public String getTransfer_type_desc() {
		return transfer_type_desc;
	}
	/**
	 * @param transfer_type_desc the transfer_type_desc to set
	 */
	public void setTransfer_type_desc(String transfer_type_desc) {
		this.transfer_type_desc = transfer_type_desc;
	}
	
	@Override
	public String toString() {
		return "transfer_types [transfer_types=" + transfer_types + ", transfer_type_desc=" + transfer_type_desc + "]";
	}
	
	

}
