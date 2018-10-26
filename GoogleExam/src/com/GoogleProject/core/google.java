package com.GoogleProject.core;

import java.io.IOException;

import org.junit.Test;

import com.google.Pages.googleHomePge;
import com.google.core.TestBase;

public class google {
	@Test
	public void run() throws IOException
	{
		TestBase.launchapplication();
		googleHomePge obj = new googleHomePge(TestBase.driver);
		obj.searchselenium();
		obj.clickonSearcgButton();
	}
	

}
