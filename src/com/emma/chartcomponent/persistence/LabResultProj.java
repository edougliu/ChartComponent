package com.emma.chartcomponent.persistence;

import java.util.Date;

public class LabResultProj {

	private String result;
	private Date recordedDateTime;
	private int recordedById;

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
}
