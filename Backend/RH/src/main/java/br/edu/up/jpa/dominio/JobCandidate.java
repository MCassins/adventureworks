package br.edu.up.jpa.dominio;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "JobCandidate")
public class JobCandidate {
	@Id
	@GeneratedValue
	private Integer jobCandidateID;
	
	@Column
	private String resume;

	@Column
	private Date modifiedDate;
	
	//@OneToOne
	//@JoinColumn
	//private Employee employee;


	public JobCandidate( Integer jobCandidateID,String resume, Date modifiedDate) {
		super();
		this.jobCandidateID = jobCandidateID;
		this.resume = resume;
		this.modifiedDate = modifiedDate;
	}


	protected JobCandidate() {
		
	}


	/*public Employee getEmployee() {
		return employee;
	}*/

	public String getResume() {
		return resume;
	}


	public void setCurriculo(String resume) {
		this.resume = resume;
	}


	public Date getDataModificada() {
		return modifiedDate;
	}


	public void setDataModificada(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
}
