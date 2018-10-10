package br.edu.up.jpa.dominio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Shift")
public class Shift {
	
	@Id
    @GeneratedValue
	private Integer shiftID;
	
	@Column
	private String name;
	
	@Column
	private Time startTime;
	
	@Column
	private Time endTime;
	
	@Column
	private Date modifiedDate;

	public Shift(Integer shiftID, String name, Time startTime, Time endTime, Date modifiedDate) {
		super();
		this.shiftID = shiftID;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.modifiedDate = modifiedDate;
	}

	protected Shift() {
		
	}

	public Integer getShiftID() {
		return shiftID;
	}

	public void setShiftID(Integer shiftID) {
		this.shiftID = shiftID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}	
}
