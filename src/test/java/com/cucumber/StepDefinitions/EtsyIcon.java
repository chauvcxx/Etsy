package com.cucumber.StepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Selenium.Functions.SearchFunctions;
import com.thoughtworks.selenium.Wait;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



public class EtsyIcon {
	WebDriver dr;
	SearchFunctions searchFunctions = new SearchFunctions();
	
    @Given("^John is viewing the Etsy landing page Icon$")
    public void navigateFromIcon() {
    	dr=new FirefoxDriver();
    	dr.get("http://www.etsy.com");
    	 
   	 }

    
    @When("^he selects \"(.*)\" and  \"(.*)\"$") 
    public void openDropdown(String icon1, String icon2) throws Throwable{
    	WebDriverWait wait = new WebDriverWait(dr, 3000);
    	searchFunctions.searchByLinkTextWithWait(wait, icon1).click();    	
    	    	
    	searchFunctions.searchByLinkTextWithWait(wait, icon2).click();
       
    }
    
    @When("^clicks on \"(.*)\"$")
    public void searchProd(String prod) throws Throwable{
    	WebDriverWait wait = new WebDriverWait(dr, 30);
     	searchFunctions.searchByLinkTextWithWait(wait, prod).click();
    }
    
    @When("^selects \"(.*)\"$")
    public void searchProduct(String product) throws Throwable{
    	WebDriverWait wait = new WebDriverWait(dr, 3000);
     	searchFunctions.searchByLinkTextWithWait(wait, product).click();
    }
    
    
    @Then("^the price should be displayed for \"(.*)\" top$")
    public void printresult(String top){
    	 WebDriverWait wait = new WebDriverWait(dr, 3000);
    	 WebElement title = searchFunctions.searchByPartialTextWithWait(wait, top);
    	 title.click();    			
    	 WebElement price = searchFunctions.searchById(dr, "listing-price");    			
    	 System.out.println(price.getText());
    	 dr.close();
    	 dr.quit();
    }    	 
}