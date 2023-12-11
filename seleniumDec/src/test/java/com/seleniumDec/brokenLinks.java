package com.seleniumDec;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenLinks extends browserCl{

	@BeforeTest
	public void openD() {
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public void link() throws Exception {
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println("Number of Broken links: "+count);
		
		for(int i=1; i<=count;i++) {
			//System.out.println(li.get(i).getText());
			String liUrl = li.get(i).getAttribute("href");
			verify(liUrl);
		}
		
	}

	private void verify(String websiteUrl) throws Exception {
		URL url = null ;
		try {
		 url = new URL(websiteUrl);
		HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
		
		
		if(httpUrlConnection.getResponseCode()== 200) {	
			System.out.println(url+" - "+httpUrlConnection.getResponseMessage());
		}
		if(httpUrlConnection.getResponseCode()== 404) {
			System.out.println(url+" - "+httpUrlConnection.getResponseMessage());
		}
	}
	//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
catch (Exception e) {
	//e.printStackTrace();
}
		/*
		if (httpUrlConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpUrlConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpUrlConnection.getResponseMessage() + " - " + "is a broken link");
			}
		}
			 catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			}
			

		if(httpUrlConnection.getResponseCode()>=400) {
			
			String result  = httpUrlConnection.getResponseMessage();
			System.out.println(websiteUrl + " - " +result +"is a broken link");
		}
		else
		{
			System.out.println(websiteUrl + " - " +httpUrlConnection.getResponseMessage());
		}
		httpUrlConnection.disconnect();
		*/
	}
	
}
