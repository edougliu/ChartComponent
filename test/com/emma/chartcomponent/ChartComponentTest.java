package com.emma.chartcomponent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emma.chartcomponent.dao.LabResultDAO;
import com.emma.chartcomponent.persistence.LabResult;
import com.emma.chartcomponent.service.*;

public class ChartComponentTest {


	@Test
	public void testGetPatientNursing() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetPatientMeds() {
		fail("Not yet implemented");

	}
	
	@Test
	public void testGetLabResult() {

	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("application-config.xml");

	       LabResultDAO labResultDAO = (LabResultDAO) context.getBean("labResultDAO");
	       String message = labResultDAO.getMessage();
	       assertEquals(message, "It works!");
	       
	       int labResultId = 1;
	       LabResult labResult = labResultDAO.getLabResult(labResultId);
	       assertEquals(labResult.getPatientId(),1);
	       assertEquals(labResult.getResultId(), 1);
	       assertEquals(labResult.getRecordedById(), 1);
	       assertEquals(labResult.getResult(), "100");
	       
	}
	
	@Test
	public void testGetLabResults() {

	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("application-config.xml");

	       LabResultDAO labResultDAO = (LabResultDAO) context.getBean("labResultDAO");
	       String message = labResultDAO.getMessage();
	       assertEquals(message, "It works!");
	       
	       int patientId = 1;
	       List<LabResult> labResults = labResultDAO.getLabResultsByPatientId(patientId);
	       assertEquals(labResults.size(),2);
	       
	       assertEquals(labResults.get(0).getLabTestId(),1);
	       assertEquals(labResults.get(0).getResultId(), 1);
	       assertEquals(labResults.get(0).getRecordedById(), 1);
	       assertEquals(labResults.get(0).getResult(), "100");
	       
	       assertEquals(labResults.get(1).getLabTestId(),2);
	       assertEquals(labResults.get(1).getResultId(), 2);
	       assertEquals(labResults.get(1).getRecordedById(), 1);
	       assertEquals(labResults.get(1).getResult(), "80");
	       
	}
	
	@Test
	public void testGetChartComponentLabResults() {
		
		int patientId = 1;        
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-config.xml");   
		ChartComponentServiceFactory factory = (ChartComponentServiceFactory) ctx.getBean("chartComponentServiceFactory"); 
		ChartComponentService chartComponentService = factory.getChartComponentServiceImpl("Labs");
		assertEquals(chartComponentService.getType(), "Labs");
		List<ChartComponent> chartData = chartComponentService.getChartComponentData(patientId);

	}
	
}
