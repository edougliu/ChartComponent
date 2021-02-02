package com.emma.chartcomponent.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emma.chartcomponent.dao.LabResultDAO;
import com.emma.chartcomponent.dao.LabResultHibernateDAO;
import com.emma.chartcomponent.persistence.LabResult;

public class LabRetrievalService {
	public List<ChartComponent> retrieveLabs(int patientId){
		//refactor - use Dependency Injection via spring
	     ApplicationContext context = 
	              new ClassPathXmlApplicationContext("application-config.xml");

	    LabResultDAO labResultDAO = (LabResultDAO) context.getBean("labResultDAO");
	    List<LabResult> labResults = labResultDAO.getLabResultsByPatientId(patientId);
		//List<LabResult> labs=labResultDAO.getLabResult(labId);
		//todo convert lab results into chart component data
		return null;
	}
		
}
