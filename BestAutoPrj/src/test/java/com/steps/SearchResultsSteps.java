package com.steps;

import com.pages.SearchResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchResultsSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SearchResultsPage searchResultsPage;
	
	@Step
	public void checkIfSearchCriteriaAppearsInResultsPage(){
		searchResultsPage.checkIfSearchCriteriaAppearsOnResultsPage();
	}
	
}
