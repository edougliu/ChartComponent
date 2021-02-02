package com.emma.chartcomponent.persistence;

import java.util.Date;

public class LabResult {
	//in the real project, I used hibernate projections to 
	//encapsulate the complexity of the legacy "non-standard" database
	//and improve performance
	private int resultId;
	private String result;
	private Date recordedDateTime;
	private int recordedById;
	private int patientId;
	private int labTestId;
	
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getRecordedDateTime() {
		return recordedDateTime;
	}
	public void setRecordedDateTime(Date recordedDateTime) {
		this.recordedDateTime = recordedDateTime;
	}
	public int getRecordedById() {
		return recordedById;
	}
	public void setRecordedById(int recordedById) {
		this.recordedById = recordedById;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getLabTestId() {
		return labTestId;
	}
	public void setLabTestId(int labTestId) {
		this.labTestId = labTestId;
	}
}
