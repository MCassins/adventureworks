package br.edu.up.jpa.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
    @GeneratedValue   
    private Integer BusinessEntityID;
    
	@Column
	private Integer nationalIDNumber;
	
	@Column
	private Integer loginID;

	@Column
	private String jobTitle;
	
	@Column
	private Date birthDate;
	
	@Column
	private char maritalStatus;
	
	@Column
	private char gender;
	
	@Column
	private Date hireDate;
	
	@Column
	private Integer salariedFlag;
	
	@Column
	private Integer vacationHours;
	
	@Column
	private Integer sickLeaveHours;
	
	@Column
	private Integer currentFlag;
	
	@Column
	private Integer rowguid;
	
	@Column
	private Date modifiedDate;

	@OneToOne
    @JoinColumn
	private JobCandidate jobCandidate;
	
	@OneToOne
    @JoinColumn
	private EmployeePayHistory employeePayHistory;
	
	@OneToOne
    @JoinColumn
	private EmployeeDepartmentHistory employeeDepartmentHistory;
		
	public Employee(Integer businessEntityID) {
		this.BusinessEntityID = businessEntityID;
	}
	public Employee(int BusinessEntityID,int nationalIDNumber,int loginID,String jobTitle,Date birthDate,char maritalStatus,
			char gender,Date hireDate,int salariedFlag,int vacationHours,int sickLeaveHours,int currentFlag,int rowguid,
			Date modifiedDate,JobCandidate jobCandidate,EmployeePayHistory employeePayHistory,EmployeeDepartmentHistory employeeDepartmentHistory) {
		this.BusinessEntityID = BusinessEntityID;
		this.nationalIDNumber = nationalIDNumber;
		this.loginID = loginID;
		this.jobTitle = jobTitle;
		this.birthDate = birthDate;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salariedFlag = salariedFlag;
		this.vacationHours = vacationHours;
		this.sickLeaveHours = sickLeaveHours;
		this.currentFlag = currentFlag;
		this.rowguid = rowguid;
		this.modifiedDate = modifiedDate;
		this.jobCandidate = jobCandidate;
		this.employeePayHistory = employeePayHistory;
		this.employeeDepartmentHistory = employeeDepartmentHistory;
	}

	public Integer getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		BusinessEntityID = businessEntityID;
	}

	public Integer getNationalIDNumber() {
		return nationalIDNumber;
	}

	public void setNationalIDNumber(Integer nationalIDNumber) {
		this.nationalIDNumber = nationalIDNumber;
	}

	public Integer getLoginID() {
		return loginID;
	}

	public void setLoginID(Integer loginID) {
		this.loginID = loginID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public char getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(char maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getSalariedFlag() {
		return salariedFlag;
	}

	public void setSalariedFlag(Integer salariedFlag) {
		this.salariedFlag = salariedFlag;
	}

	public Integer getVacationHours() {
		return vacationHours;
	}

	public void setVacationHours(Integer vacationHours) {
		this.vacationHours = vacationHours;
	}

	public Integer getSickLeaveHours() {
		return sickLeaveHours;
	}

	public void setSickLeaveHours(Integer sickLeaveHours) {
		this.sickLeaveHours = sickLeaveHours;
	}

	public Integer getCurrentFlag() {
		return currentFlag;
	}

	public void setCurrentFlag(Integer currentFlag) {
		this.currentFlag = currentFlag;
	}

	public Integer getRowguid() {
		return rowguid;
	}

	public void setRowguid(Integer rowguid) {
		this.rowguid = rowguid;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public JobCandidate getJobCandidate() {
		return jobCandidate;
	}

	public void setJobCandidate(JobCandidate jobCandidate) {
		this.jobCandidate = jobCandidate;
	}

	public EmployeePayHistory getEmployeePayHistory() {
		return employeePayHistory;
	}

	public void setEmployeePayHistory(EmployeePayHistory employeePayHistory) {
		this.employeePayHistory = employeePayHistory;
	}

	public EmployeeDepartmentHistory getEmployeeDepartmentHistory() {
		return employeeDepartmentHistory;
	}

	public void setEmployeeDepartmentHistory(EmployeeDepartmentHistory employeeDepartmentHistory) {
		this.employeeDepartmentHistory = employeeDepartmentHistory;
	}
	
	
}
