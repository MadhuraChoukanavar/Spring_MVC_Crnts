package org.crnts.collagedatamvc.bean;

import javax.validation.constraints.NotEmpty;


public class Department {
	//@NotNull(message = "id should be mentioned")
	int dId;
	@NotEmpty(message = "name should not be null")
	String dName;
	String dHead; 
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdHead() {
		return dHead;
	}
	public void setdHead(String dHead) {
		this.dHead = dHead;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dHead=" + dHead + "]";
	}
	
	
	

}
