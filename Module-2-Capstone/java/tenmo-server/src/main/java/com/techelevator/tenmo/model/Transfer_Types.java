package com.techelevator.tenmo.model;

public class Transfer_Types {
	
	private Long transfer_types;
	private String transfer_type_desc;
	
	public Transfer_Types(Long transfer_types, String transfer_type_desc) {
		this.transfer_types = transfer_types;
		this.transfer_type_desc = transfer_type_desc;
	}

	public Long getTransfer_types() {
		return transfer_types;
	}

	public void setTransfer_types(Long transfer_types) {
		this.transfer_types = transfer_types;
	}

	public String getTransfer_type_desc() {
		return transfer_type_desc;
	}

	public void setTransfer_type_desc(String transfer_type_desc) {
		this.transfer_type_desc = transfer_type_desc;
	}

	@Override
	public String toString() {
		return "transfer_types [transfer_types=" + transfer_types + ", transfer_type_desc=" + transfer_type_desc + "]";
	}
	
	

}
