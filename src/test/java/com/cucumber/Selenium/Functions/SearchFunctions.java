package com.cucumber.Selenium.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctions {
	
	

   public WebElement searchById(WebDriver driver, String searchText) {
	   return driver.findElement(By.id(searchText));
   }
   
   public WebElement searchByIdWithWait(WebDriverWait wait, String searchText) {
	  	
		return wait.until(ExpectedConditions.elementToBeClickable(By.id(searchText)));
   }
   
   public WebElement searchByLinkText(WebDriver driver, String searchText) {
	   return driver.findElement(By.linkText(searchText));
   }
   
   public WebElement searchByLinkTextWithWait(WebDriverWait wait, String searchText) {
	  return wait.until(ExpectedConditions.elementToBeClickable(By.linkText(searchText)));
   }
   public WebElement searchByPartialText(WebDriver driver, String searchText) {
	   return driver.findElement(By.partialLinkText(searchText));
   }
   
   public WebElement searchByPartialTextWithWait(WebDriverWait wait, String searchText) {
	 return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(searchText)));
   }
}
