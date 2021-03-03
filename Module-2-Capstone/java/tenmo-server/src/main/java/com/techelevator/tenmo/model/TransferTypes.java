package com.techelevator.tenmo.model;

public class TransferTypes {
	
	private Long transferTypes;
	private String transferTypeDesc;
	
	public TransferTypes(Long transfer_types, String transfer_type_desc) {
		this.transferTypes = transfer_types;
		this.transferTypeDesc = transfer_type_desc;
	}

	public Long getTransfer_types() {
		return transferTypes;
	}

	public void setTransfer_types(Long transfer_types) {
		this.transferTypes = transfer_types;
	}

	public String getTransfer_type_desc() {
		return transferTypeDesc;
	}

	public void setTransfer_type_desc(String transfer_type_desc) {
		this.transferTypeDesc = transfer_type_desc;
	}

	@Override
	public String toString() {
		return "transfer_types [transfer_types=" + transferTypes + ", transfer_type_desc=" + transferTypeDesc + "]";
	}
	
	

}
