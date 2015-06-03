package com.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.Tools.SearchResultModel;
import com.pages.SearchResultNegativePricePage;

public class NegativePriceSteps extends ScenarioSteps{
	
	private static final long serialVersionUID = -2720813425594420977L;
	SearchResultNegativePricePage searchResultNegativePricePage;
	
	@StepGroup
	public List<SearchResultModel> negativePrice(){
		 return searchResultNegativePricePage.checkIfPriceIsNegative();
	}
	
	
	@Step
	public void verifyPrice(String name, String expectedPrice){
		searchResultNegativePricePage.verifyPrice(expectedPrice);
	}
}
