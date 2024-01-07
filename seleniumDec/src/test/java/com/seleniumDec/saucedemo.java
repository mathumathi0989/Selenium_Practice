package com.seleniumDec;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class saucedemo extends browserCl {

	String user_id = "standard_user";
	String user_pwd = "secret_sauce";
	String product_name = "Sauce Labs Bolt T-Shirt";
	String firstName = "Mathu";
	String lastName = "Mathi";
	String zipcodee = "12345";
	
	String product_Lowercase;	
	String[] appe;
	String product_name_filter = "";
	String cart_prod_name;
	String cart_prod_price;
	String title;
	
	By u_id = By.id("user-name");
	By pwd = By.id("password");
	By login_Btn = By.id("login-button");
	//product list
	//By prd = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	 By prd = By.xpath("//button[@id='add-to-cart-'" + product_name_filter + "']");
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
	
@Test(priority=0)
	public void Login() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(u_id).sendKeys(user_id);
		driver.findElement(pwd).sendKeys(user_pwd); 
		driver.findElement(login_Btn).click();
		title = driver.getTitle();	
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	public void productPage() throws Exception {
		 product_Lowercase = product_name.toLowerCase();
			appe =  product_Lowercase.split(" ");
			
			for(String spa : appe) {
			if(spa==appe[appe.length-1]) {
				product_name_filter = product_name_filter+spa;
				break;
			}
			product_name_filter = product_name_filter + spa + "-";
			}
		driver.findElement(By.xpath("//button[@id='add-to-cart-" + product_name_filter + "']")).click();
		Thread.sleep(3000);
		driver.findElement(prd_cart).click();
		Thread.sleep(3000);
		 cart_prod_name = driver.findElement(cart_prd).getText();
		Assert.assertEquals(product_name, cart_prod_name);
		 cart_prod_price = driver.findElement(cart_price).getText();
		driver.findElement(chkout).click();
		
	}
	
	@Test(priority=2)
	public void checkoutPage() throws Exception {
		driver.findElement(fName).sendKeys(firstName);
		driver.findElement(lName).sendKeys(lastName);
		driver.findElement(ZipCode).sendKeys(zipcodee);
		driver.findElement(continueBtn).click();
		Thread.sleep(3000);
		String review_prod_name = driver.findElement(review_prd).getText();
		Assert.assertEquals(cart_prod_name, review_prod_name);
		String review_prod_price = driver.findElement(review_price).getText();
		Assert.assertEquals(cart_prod_price, review_prod_price);
		driver.findElement(finishBtn).click();
	}
	@Test(priority=3)
	public void thankPage() {
		String thank_line = driver.findElement(thkLine).getText();
		Assert.assertEquals("Thank you for your order!", thank_line);
		String orderLine = driver.findElement(orderCmplete).getText();
		System.out.println(orderLine);
		driver.findElement(bkHome).click();
		String order_title = driver.getTitle();
		Assert.assertEquals(title, order_title);
	
	}
	
	
	
}
