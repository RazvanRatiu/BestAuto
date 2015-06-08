package com.steps;

import com.pages.CarsResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchCarsSteps extends ScenarioSteps {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CarsResultsPage carsResultsPage;
	
	
	@Step
	public void searchCars(){
		carsResultsPage.getCarsInfo();
	}
}
