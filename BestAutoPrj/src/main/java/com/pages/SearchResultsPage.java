package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.apache.xalan.templates.ElemApplyImport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends PageObject {

	@FindBy(id = "results_list")
	private WebElement searchPageContainer;

	public void checkIfSearchCriteriaAppearsOnResultsPage() {
		element(searchPageContainer).waitUntilVisible();

		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[itemprop='itemListElement']"));

		for (WebElement webElement : resultListItems) {

			System.out.println("Element: " + webElement.getText());

		}
	}

}
