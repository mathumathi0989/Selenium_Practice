package com.seleniumDec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dynamicTable extends browserCl{

	/*
Verify that there are only 4 structure values present in the table with Selenium
Verify that the 6th row of the table (Last Row) has only two columns with Selenium
Find the tallest structure in the table with Selenium

	 */
	@Test
	public void dynamic_iterate() {
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
