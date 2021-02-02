package com.emma.chartcomponent.service;

import java.util.Map;
import java.lang.IllegalStateException;

public class ChartComponentServiceFactory {
	
	private Map<String, ChartComponentService> chartComponentServiceMap;   
	
	private ChartComponentService chartComponentServiceImpl;
	
	public ChartComponentService getChartComponentServiceImpl(String type) {
		if (chartComponentServiceMap == null) {
			throw new IllegalStateException("Spring did not instantiate ChartComponentServiceMap");
		}
		return chartComponentServiceMap.get(type);
	}
	
	public void setChartComponentServiceMap(Map<String, ChartComponentService> chartComponentServiceMap) {   
        this.chartComponentServiceMap = chartComponentServiceMap;   
    } 
	
}
