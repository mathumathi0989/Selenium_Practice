package com.seleniumDec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class staticTable extends browserCl {

	@Test
	public void iterate() {
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> row_elements = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int row = row_elements.size();
		System.out.println(row_elements.size());
		List<WebElement> col_elements = driver.findElements(By.xpath(" //table[@id='customers']//tr/th"));
		int col = col_elements.size();
		System.out.println(col_elements.size());
		
		for(int i=2; i<=row; i++) {
			for (int j=1; j<=col; j++) {
				System.out.print(
				driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText() + " ");
			}
			System.out.println();
		}
		
		/*
		 * Number of rows -
		 
	    	//table[@id='customers']//tr
		 //table[@class='tsc_table_s13']//tr
		 
		 Number of columns - 
		 //table[@id='customers']//tr/th
		 //table[@class='tsc_table_s13']//tr/th
		  
		  
		  
		 */
	
		
		
		
		
		
	}
	
	
}
