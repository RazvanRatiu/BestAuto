package com.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.apache.xalan.templates.ElemApplyImport;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tools.SearchResultModel;

public class SearchResultsPage extends PageObject {

	@FindBy(id = "results_list")
	private WebElement searchPageContainer;

	public void checkIfSearchCriteriaAppearsOnResultsPage(String searchText) {

		boolean found = false;
		element(searchPageContainer).waitUntilVisible();

		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[class='vehicle_info'] h2 a"));

		for (WebElement element : resultListItems) {

			if (element.getText().toLowerCase()
					.contains(searchText.toLowerCase())) {
				found = true;
			} else {
				found = false;
			}
			System.out.println("Element: " + element.getText());

		}
		Assert.assertTrue("The search criteria is not in the page", found);
	}

	public void checkIfPriceIsInEuro() {

		List<SearchResultModel> priceList = new ArrayList<SearchResultModel>();
		element(searchPageContainer).waitUntilVisible();
		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[itemprop='itemListElement']"));

		boolean check = false;

		for (WebElement element : resultListItems) {
			System.out.println("Pret: "
					+ element.findElement(By.cssSelector("h3")).getText());
			System.out.println("Name: "
					+ element.findElement(By.cssSelector("h2 a")).getText());
			SearchResultModel itemNow = new SearchResultModel();
			String price = element.findElement(
					By.cssSelector("h3 span:first-child")).getText();
			priceList.add(itemNow);

			if (price.contains("EUR")) {
				check = true;
			} else {
				check = false;
			}
			Assert.assertTrue("The price is in euro", check);
		}
	}
 
}
