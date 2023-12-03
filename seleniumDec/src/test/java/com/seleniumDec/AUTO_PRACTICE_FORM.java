package com.seleniumDec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AUTO_PRACTICE_FORM extends browserCl{

	

	
	private String url = "https://www.techlistic.com/p/selenium-practice-form.html";
	private String FirstName = "Mathu";
	private String LastName = "Bala";
	private String dateT = "12/3/2023";
	private Select s;
	private Select s1;
	
	
	By fName = By.name("firstname");
	By lName = By.name("lastname");
	By sex = By.id("sex-1");
	By years = By.id("exp-4");
	By date = By.id("datepicker");
	By prof = By.id("profession-1");
	By tools = By.id("tool-2");
	By selec = By.className("input-xlarge");
	By seleCom = By.id("selenium_commands");
	By image = By.className("input-file");
	By download = By.xpath("//*[contains(text(),'Download File')]//following-sibling::a");
	By submit = By.name("submit");
	
	
	
	
	@Test
	public void automationForm() throws Exception {
		driver.get(url);
		Thread.sleep(5);
		driver.findElement(fName).sendKeys(FirstName);
		driver.findElement(lName).sendKeys(LastName);
		driver.findElement(sex).click();
		driver.findElement(years).click();
		driver.findElement(date).sendKeys(dateT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(prof).click();
		driver.findElement(tools).click();
		
	 s = new Select(driver.findElement(selec));
		s.selectByVisibleText("North America");
		
		s1 = new Select(driver.findElement(seleCom));
		s1.selectByVisibleText("Wait Commands");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(image).sendKeys("C:\\Users\\mathu\\Pictures\\Screenshots\\Screenshot 2023-11-19 120119.png");
		
		driver.findElement(download).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		//driver.findElement(submit).submit();;
		
		
		
		
		
		
	}
	
}
