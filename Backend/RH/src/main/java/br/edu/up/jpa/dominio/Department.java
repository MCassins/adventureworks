package br.edu.up.jpa.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
@Entity
@Table(name = "Department")
public class Department {
	
	@Id
    @GeneratedValue
	private Integer departamentID;
	
	@Column
	private String name;
	
	@Column
	private String groupName;
	
	@Column
	private Date modifiedDate;
	

	public Department(Integer departamentID,String name, String groupName, Date modifiedDate) {
		this.departamentID=departamentID;
		this.name = name;
		this.groupName = groupName;
		this.modifiedDate = modifiedDate;
	}

	protected Department() {
		
	}

	public Integer getDepartamentID() {
		return departamentID;
	}

	public void setDepartamentID(Integer departamentID) {
		this.departamentID = departamentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
