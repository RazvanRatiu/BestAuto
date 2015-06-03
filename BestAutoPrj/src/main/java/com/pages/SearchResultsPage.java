package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.apache.xalan.templates.ElemApplyImport;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends PageObject {

	@FindBy(id = "results_list")
	private WebElement searchPageContainer;

	public void checkIfSearchCriteriaAppearsOnResultsPage(String searchText) {

		boolean found = true;
		element(searchPageContainer).waitUntilVisible();

		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[class='vehicle_info'] h2 a"));

		for (WebElement element : resultListItems) {

			if (element.getText().toLowerCase()
					.contains(searchText.toLowerCase())) {
				found = true;
			} else{
				found = false;
			}
			System.out.println("Element: " + element.getText());

		}
		Assert.assertTrue("The search criteria is not in the page", found);
	}
	
	
	
}
