package com.steps;

import com.pages.SearchResultNegativePricePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NegativePriceSteps extends ScenarioSteps{
	
	SearchResultNegativePricePage searchResultNegativePricePage;
	
	@Step 
	public void negativePrice(){
		searchResultNegativePricePage.checkIfPriceIsNegative();
		
	}
}
