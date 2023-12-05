package com.seleniumDec;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class staticTable extends browserCl {

	@Test
	public void static_iterate() {
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> row_elements = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int row = row_elements.size();
		System.out.println("Number of rows: " + row_elements.size());
		List<WebElement> col_elements = driver.findElements(By.xpath(" //table[@id='customers']//tr/th"));
		int col = col_elements.size();
		System.out.println("Number of columns: " +col_elements.size());
		List <WebElement> header_elements = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int header = header_elements.size();
		for(int k=1; k<=header; k++) 
		{
			System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th["+k+"]")).getText() + " ");
		}
		System.out.println();
	
		for(int i=2; i<=row; i++) 
		{
			for (int j=1; j<=col; j++)
			{
			System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText() + " ");
			}
			System.out.println();
		}
		
	}
	
	
}
