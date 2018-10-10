package br.edu.up.jpa.dominio;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "EmployeePayHistory")
public class EmployeePayHistory {
		
	@Id
	private Date rateDateChange;
	
	@Column
	private double rate;
	
	@Column
	private Integer payFrequency;
	
	@Column
	private Date modifiedDate;
	
	@OneToOne
	@JoinColumn
	private Employee employee;

	
	
	public EmployeePayHistory(Date rateDateChange, double rate, Integer payFrequency, Date modifiedDate,Employee employee) {
		this.rateDateChange = rateDateChange;
		this.rate = rate;
		this.payFrequency = payFrequency;
		this.modifiedDate = modifiedDate;
		this.employee = employee;
	}

	protected EmployeePayHistory() {
		
	}

	public Date getRateDateChange() {
		return rateDateChange;
	}

	public void setRateDateChange(Date rateDateChange) {
		this.rateDateChange = rateDateChange;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Integer getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(Integer payFrequency) {
		this.payFrequency = payFrequency;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setDataModificada(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/*public Empregado getEEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
}
