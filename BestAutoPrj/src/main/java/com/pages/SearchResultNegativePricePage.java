package com.pages;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tools.SearchResultModel;

@DefaultUrl("http://bestauto.ro")
public class SearchResultNegativePricePage extends PageObject{
	
	@FindBy(id = "results_list")
	private WebElement searchPageContainer; 
	
	public List<SearchResultModel> checkIfPriceIsNegative(){
		List<SearchResultModel> priceList = new ArrayList<SearchResultModel>();
		element(searchPageContainer).waitUntilVisible();
		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[itemprop='itemListElement']"));
//		List<WebElement> resultListItems = searchPageContainer.findElements(By
//				.cssSelector("div[class='vehicle_info'] h3 :first-child"));
		
		
		for(WebElement element : resultListItems){
			System.out.println("-------------------------------");
			System.out.println("Name: " + element.findElement(By.cssSelector("h2 a")).getText());
			System.out.println("Pret: " + element.findElement(By.cssSelector("h3")).getText());
			
			SearchResultModel itemNow = new SearchResultModel();
			
			String price = element.findElement(By.cssSelector("h3")).getText().replace(" EUR", "").replace(".", "").trim();

			itemNow.setName(element.findElement(By.cssSelector("h2 a")).getText());
			itemNow.setPrice(price);
			
			priceList.add(itemNow);
			
		}
	
		return priceList;
	}
	
	public void verifyPrice(String price){
		BigDecimal compareNumber = new BigDecimal(0);
		System.out.println("Price: " + price);
		if(!price.isEmpty() && price.toLowerCase().contains("fara pret")){
				compareNumber = new BigDecimal(price);
			
		}
		
		Assert.assertTrue("Failure: Expected price to be a positive number. Actual: " + price, compareNumber.compareTo(new BigDecimal(0)) > 0);
	}

}