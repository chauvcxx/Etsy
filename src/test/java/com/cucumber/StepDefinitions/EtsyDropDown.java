package com.cucumber.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Selenium.Functions.SearchFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class EtsyDropDown {
	WebDriver dr;
	
	SearchFunctions searchFunctions = new SearchFunctions();
	
    @Given("^John is viewing the Etsy landing page$")
    public void navigate() {
    	
    	dr=new FirefoxDriver();
    	dr.get("http://www.etsy.com");     	   		   
    }

    @When("^he selects \"(.*)\" and \"(.*)\" from the dropdown menu$")
    public void openDropdown(String menu1, String menu2) throws Throwable{
    	searchFunctions.searchByLinkText(dr, menu1).click();
    	WebDriverWait wait = new WebDriverWait(dr, 3000);
    	searchFunctions.searchByLinkTextWithWait(wait, menu2).click();
    	
    }
    
    @When("^he clicks on \"(.*)\"$")
    public void searchProduct(String product) throws Throwable{
  	
     	searchFunctions.searchByLinkText(dr, product).click();
    }
    
    @Then("^the price should be displayed for \"(.*)\" belts$")
    public void printresult(String belts){
    	WebDriverWait wait = new WebDriverWait(dr, 3000);
	   	WebElement title = searchFunctions.searchByPartialTextWithWait(wait, belts);
	    
    	title.click();    			
    	WebElement price = searchFunctions.searchById(dr, "listing-price");    			
    	System.out.println(price.getText());
       dr.close();
       dr.quit();
    }   
    
    
}