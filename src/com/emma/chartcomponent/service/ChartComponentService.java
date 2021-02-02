package com.emma.chartcomponent.service;

import java.util.List;

public interface ChartComponentService {
	List<ChartComponent> getChartComponentData(int patientId);
	String getType();
}
