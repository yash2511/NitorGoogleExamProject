package com.google.core;

import java.awt.AWTException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.utilities.testConfigRead;



public class TestBase {

		public static WebDriver driver;

		public static void launchapplication() {

			System.setProperty("webdriver.chrome.driver", "C://Users//yashodeep.patil//workspace//GoogleExam//Resources//chromedriver.exe");

				TestBase.driver = new ChromeDriver();


		
			driver.get(testConfigRead.getConfigDetails().get("url"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}

		public static void editTextBox(WebElement textBox, String value) {
			
		
				textBox.clear();
				textBox.sendKeys(value);
			
		}

		public static void clickAction(WebElement element) {
			
			element.click();
		}
	
}
