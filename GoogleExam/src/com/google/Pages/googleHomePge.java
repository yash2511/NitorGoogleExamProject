package com.google.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.core.TestBase;
import com.google.utilities.ExcelUtils;

public class googleHomePge {
	

	 @FindBy(id="lst-ib")
	WebElement googleEditBox;

	 @FindBy(name="btnK")
	 WebElement searchButton;
	

  

    public googleHomePge(WebDriver driver){

    	TestBase.driver = driver;

    }

    //Set user name in textbox

    public void searchselenium() throws IOException{

    	TestBase.editTextBox(googleEditBox, ExcelUtils.setExcelFile(0,0));
    }

    public void clickonSearcgButton() throws IOException{
    	
    	TestBase.clickAction(searchButton);
    	
    }
}
