package org.crnts.collagedatamvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_details")
public class DepartmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	int dId;
	@Column(name="dept_name")
	String dName;
	@Column(name="dept_head")
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
