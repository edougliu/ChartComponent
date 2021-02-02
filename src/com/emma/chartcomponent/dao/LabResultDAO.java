package com.emma.chartcomponent.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.emma.chartcomponent.persistence.LabResult;

public interface LabResultDAO {

	public String getMessage();
	public void setMessage(String message);
	void setSessionFactory(SessionFactory sessionFactory);
	
	public LabResult getLabResult(int labResultId);
	public List<LabResult> getLabResultsByPatientId(int patientId);
}
