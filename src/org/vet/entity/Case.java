package org.vet.entity;

public class Case
{
	private String description ;
	private String symptoms;
	private String status;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Case(String description, String symptoms, String status) {
		super();
		this.description = description;
		this.symptoms = symptoms;
		this.status = status;
	}
	

	
}
