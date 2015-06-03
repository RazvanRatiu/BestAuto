package com.steps;

import com.pages.SearchResultNegativePrice;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NegativePriceSteps extends ScenarioSteps{
	
	SearchResultNegativePrice searchResultNegativePrice;
	
	@Step 
	public void negativePrice(){
		searchResultNegativePrice.checkIfPriceIsNegative();
		
	}
}
