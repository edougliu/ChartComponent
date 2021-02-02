package com.emma.chartcomponent.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.emma.chartcomponent.persistence.LabResult;


public class LabResultHibernateDAO implements LabResultDAO {

	private String message;
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public Collection loadLabDataByCategory(int labResultId) throws DataAccessException {
    	return this.hibernateTemplate.find("from LabResult labResult where LabResult.labResultId=?", labResultId);
    }

	@Override
	public LabResult getLabResult(int labResultId) {
		return (LabResult) this.hibernateTemplate.get(LabResult.class, labResultId);
	}

	@Override
	public List<LabResult> getLabResultsByPatientId(int patientId) {
		List result = this.hibernateTemplate.find("from LabResult labResult where patientId=?", patientId);
		return (List<LabResult>) result;
	}

 /* using hibernate projection
	public List<LabResult> getLabResultsByPatientIdProjection(int patientId) {


		String query = "select new LabResultProj(recordedDateTime, recordedById, result) "
		+ " from PatId patient join Result result on patient.Id = result.patientId"
		+ " join ResultTest test on result.resId = test.resId "; 
		
		List labs =   this.hibernateTemplate.find(query);
		return (List<LabResult>) labs;
	} */
}
