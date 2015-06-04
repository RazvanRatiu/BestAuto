package com.pages;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Tools.*;


@DefaultUrl("http://bestauto.ro")
public class SearchResultNegativePrice extends PageObject{
	
	@FindBy(id = "results_list")
	private WebElement searchPageContainer; 
	
	public List<SearchResultModel> checkIfPriceIsNegative(){
		
		List<SearchResultModel> priceList = new ArrayList<SearchResultModel>();
		element(searchPageContainer).waitUntilVisible();
		List<WebElement> resultListItems = searchPageContainer.findElements(By
				.cssSelector("div[itemprop='itemListElement']"));
//		List<WebElement> resultListItems = searchPageContainer.findElements(By
//				.cssSelector("div[class='vehicle_info'] h3 :first-child"));
		
		boolean check = false;
		
		for(WebElement element : resultListItems){
			System.out.println("Pret: " + element.findElement(By.cssSelector("h3")).getText());
			System.out.println("Name: " + element.findElement(By.cssSelector("h2 a")).getText());
			SearchResultModel itemNow = new SearchResultModel();
			
			String price = element.findElement(By.cssSelector("h3 span:first-child")).getText().replace(" EUR", "").trim();
			int pretz = Integer.parseInt(price);
			
//			itemNow.setPrice(Integer.valueOf(price));
//			//add name to itemNow
			
			
			priceList.add(itemNow);
			
			if(pretz > 0){
				check = true; 
//				
			}else{
				check = false; 
//				
			}
			
			
		}
		Assert.assertTrue("The price is not negative",check);
		return priceList;
		
		
		
		
		
	}

}