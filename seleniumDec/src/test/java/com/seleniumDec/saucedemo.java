package com.seleniumDec;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class saucedemo extends browserCl {

	String user_id = "standard_user";
	String user_pwd = "secret_sauce";
	String product = "Test.allTheThings() T-Shirt (Red)";
			
	
	By u_id = By.id("user-name");
	By pwd = By.id("password");
	By login_Btn = By.id("login-button");
	//product list
	By prd = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	By prd_cart = By.xpath("//a[@class='shopping_cart_link']");
	//cart list
	By cart_prd = By.xpath("//div[@class='inventory_item_name']");
	By cart_price = By.xpath("//div[@class='inventory_item_price']");
	By chkout = By.xpath("//button[@id='checkout']");
	//checkout page
	By fName = By.xpath("//input[@id='first-name']");
	By lName = By.xpath("//input[@id='last-name']");
	By ZipCode = By.xpath("//input[@id='postal-code']");
	By continueBtn = By.xpath("//input[@id='continue']");
	//Review page
	By review_prd = By.xpath("//div[@class='inventory_item_name']");
	By review_price = By.xpath("//div[@class='inventory_item_price']");
	By finishBtn = By.xpath("//button[@id='finish']");
	//Thankyou page
	By thkLine = By.xpath("//h2[normalize-space()='Thank you for your order!']");
	By orderCmplete = By.xpath("//div[@class='complete-text']");
	By bkHome = By.xpath("//button[@id='back-to-products']");
	
	
	@Test
	public void Login() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(u_id).sendKeys(user_id);
		driver.findElement(pwd).sendKeys(user_pwd); 
		driver.findElement(login_Btn).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
	}
}
