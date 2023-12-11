package com.seleniumDec;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenLinks extends browserCl{

	@BeforeTest
	public void openD() {
		driver.get("https://amazon.com");
	}
	
	@Test
	public void link() throws Exception {
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println("Number of links: "+count);
		
		for(WebElement link : li) {
			//System.out.println(li.get(i).getText());
			String liUrl = link.getAttribute("href");
			if(liUrl!=null) {
			verify(liUrl);
			}
		}
		
	}

	private void verify(String websiteUrl) throws Exception {
		  if(isUrlValid(websiteUrl)) {
		URL url = null ;

		 url = new URL(websiteUrl);
		HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
	

		if(httpUrlConnection.getResponseCode()>=400) {
			
			String result  = httpUrlConnection.getResponseMessage();
			System.out.println(websiteUrl + " - " +httpUrlConnection.getResponseCode() +"is a broken link");
		}
		else
		{
			System.out.println(websiteUrl + " - " +httpUrlConnection.getResponseCode());
		}
		httpUrlConnection.disconnect();
		  }
	}
	
	 public static boolean isUrlValid(String url) {
		  try {
		   URL obj = new URL(url);
		   obj.toURI();
		   return true;
		  }catch(MalformedURLException e) {
		   return false;
		  }catch(URISyntaxException e) {
		   return false;
		  } 
		  
		 } 
	
}
