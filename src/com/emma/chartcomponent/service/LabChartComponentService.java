package com.emma.chartcomponent.service;

import java.util.List;

public class LabChartComponentService extends LabRetrievalService
	implements ChartComponentService {
	
	private String Type="Labs";
	
	@Override
	public List<ChartComponent> getChartComponentData(int patientId) {
		return super.retrieveLabs(patientId);
	}
	public String getType() {
		return Type;
	}

}
