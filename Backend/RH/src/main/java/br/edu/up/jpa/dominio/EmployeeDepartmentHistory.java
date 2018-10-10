package br.edu.up.jpa.dominio;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;
@Entity
@Table(name = "EmployeeDepartamentHistory")
public class EmployeeDepartmentHistory {

	@Id
	private Integer businessEntityID;

	@Column
	private Date startDate;

	@Column
	private Date endDate;
	
	@Column
	private Date modifiedDate;
	
	@OneToOne
	@JoinColumn
	private Department department;


	public EmployeeDepartmentHistory(Integer businessEntityID,Date startDate, Date endDate, Date modifiedDate, Department department) {
		this.businessEntityID = businessEntityID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modifiedDate = modifiedDate;
		this.department = department;
	}

	protected EmployeeDepartmentHistory() {
		
	}

	public Integer getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.businessEntityID = businessEntityID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	}
