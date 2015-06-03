package com.steps;

import java.util.List;

import com.Tools.SearchResultModel;
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
	public void checkIfSearchCriteriaAppearsInResultsPage(String text){
		searchResultsPage.checkIfSearchCriteriaAppearsOnResultsPage(text);
	}
	
	@Step
	public void checkIfPriceIsInEuro(){
		 searchResultsPage.checkIfPriceIsInEuro();
	} 
}
