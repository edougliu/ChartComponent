package com.emma.chartcomponent.service;

import java.util.List;

public class VitalSignChartComponentService extends VitalSignRetrievalService
implements ChartComponentService {
	
	private String Type="VitalSigns";

	@Override
	public List<ChartComponent> getChartComponentData(int patientId) {
		return (List<ChartComponent>) super.getVitalSignsForPatient(patientId);
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
}
