package com.PO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

import com.qa.util.BrowserManager;



public class PO_Search {
      WebDriver driver;
      
      public PO_Search(WebDriver driver) {
    	  this.driver = driver;
      }
      @FindBy(how=How.CLASS_NAME, using = "Pke_EE")
     private WebElement txtbx_search;
      
      @FindBy(how=How.XPATH, using = "//button[@type = 'submit']")
      WebElement btn_search;
      //methods
      
      public void SetSearchTextBox(String arg)  {
    	  txtbx_search.sendKeys(arg); 
    	  txtbx_search.sendKeys(Keys.ENTER);
    	  Reporter.log("product entered in search box:"+arg,true);
      }
     /* public void ClickSearchButton() {
    	  btn_search.click();
    	  Reporter.log("search button clicked",true);
      }*/      
     // Business methods 
      public void SearchProduct(String arg)  {
    	  SetSearchTextBox(arg);
    	 // ClickSearchButton();
    	  String actual =driver.getTitle();
    	  System.out.println(actual);
    	  String expected = "Computer- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
    	  Assert.assertEquals(actual,expected,"App is not able to search product:");
    	  Reporter.log("able to search for the product successfully."+arg,true);
      }
      
}
