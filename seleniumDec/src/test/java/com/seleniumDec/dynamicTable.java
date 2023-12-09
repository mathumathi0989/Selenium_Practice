package com.seleniumDec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicTable extends browserCl{

	/*
Verify that there are only 4 structure values present in the demo table
Verify that Burj Khalifa has a height of 829m with Selenium
 Verify that the last row (6th) of the table has only two columns with Selenium
 Find the tallest structure in the table with Selenium
 
	 */

	public void browserURL() {
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
	}


	public void dynamic_iterate() {
		
		//number of rows
		List<WebElement> no_of_rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr"));
		int rows = no_of_rows.size();
		System.out.println("Number of rows: "+rows);
		
		//number of columns
		List<WebElement> no_of_columns = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead//th"));
		int cols = no_of_columns.size();
		System.out.println("Number of columns: "+cols);
		
		try {
			for(int i=1; i<rows; i++) {
				for (int j=1; j<cols; j++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText() + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {

		}	
	}
	
	
	public void verify_structure_values_4() {
		//Verify that there are only 4 structure values present in the demo table
		List<WebElement> struc = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
		int count = 0;
		for (int i=1; i<=struc.size(); i++) {
		String struc_name = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText();
		count = count +1;
		System.out.println(struc_name);
		}
		
		System.out.println("Number of structures: " +count);
		Assert.assertEquals(count, 4);
	}
	
	
	public void burj_height_verify() {
		//Verify that Burj Khalifa has a height of 829m with Selenium
	String actual_Height = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/th/following-sibling::td[3]/span")).getText();
	System.out.println(actual_Height);
	String trim_Height = actual_Height.substring(0, actual_Height.length()-1);
	Assert.assertEquals(trim_Height, "829");
	
	
	}
	
	
	public void lastRow_ColnsVerify() {
		// Verify that the last row (6th) of the table has only two columns with Selenium
		
		List<WebElement> lastRow = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/child::*"));
		int result = lastRow.size();
		System.out.println("Number of columns in last row: " + result);
		
		Assert.assertEquals(2, result);
		
		
	}
	@Test
	public void tallest() {
		// Find the tallest structure in the table with Selenium
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> height = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody//td[3]"));
		int count_height = height.size();
		System.out.println(count_height);
		int count = 0;
		String structure = "" ;
		for(int i=1; i<=count_height; i++) {
			
		String before_Trim = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[3]")).getText();
		
		String value = before_Trim.substring(0,before_Trim.length()-1);
		int valueInt = Integer.parseInt(value);
		
		if(valueInt>count)
		{
		count = valueInt;
		 structure = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[3]//preceding-sibling::th")).getText();
		}
		
		
		}
		System.out.println("Tallest structure's height is " +count);
		System.out.println("Tallest structure is " + structure);
		
		
	}
	
}
