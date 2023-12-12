package com.seleniumDec;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eCommerceWeb extends browserCl {

	String emailid = "mathu@gmail.com";
	String password = "Success@1";
	By signin = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By email = By.id("email");
	By pass = By.id("pass");
	By signinB = By.id("send2");
	By name = By.xpath("//div[@class='panel header']//span[@class='logged-in']");
	By search = By.id("search");
	By search_button = By.xpath("//div[@class='actions']/button[@type='submit']");
	String search_text = "tank";
	By search_results = By.xpath("//span[@class='base']");
	By product_list = By.xpath("//a[@class='product-item-link']");
	String product_name = "Antonia Racer Tank";
	By cart = By.xpath("//button[@title='Add to Cart']");
	By size = By.xpath("//div[@class='swatch-option text' and @index='2']");
	By color = By.xpath("//div[@class='swatch-option color' and @index='1']");
	By quantity = By.xpath("//input[@id='qty']");
	String quantity_no = "2";
	By cartQty = By.xpath("//span[@class='counter-number']");
	By viewandEdit = By.xpath("//a[@class='action viewcart']/span");
	//product item cart page
	By cart_name = By.xpath("//div[@class='product']/div[@class='product-item-details']/strong/a");
	
	
	
	@BeforeTest
	public void open() {
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
	}
	
@Test(priority=0)
	public void Login() throws Exception {
	/*
Scenario 1: Login
Navigate to the login page
Fill in the required fields with valid data
Submit the login form
Verify the successful login message or the user's profile page
	 */
	driver.findElement(signin).click();
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(pass).sendKeys(password);
	driver.findElement(signinB).click();
	Thread.sleep(30);
	String nameD = driver.findElement(name).getText();
		System.out.println(nameD);
		Assert.assertEquals(nameD, "Welcome, Mathu Bala!");	
	}
	

@Test(priority=1)
public void search() throws Exception {
			/*Scenario 2: Search Functionality
Open the home page
Enter a search query in the search field
Click on the search button
Verify that the search results are displayed correctly
*/
	driver.findElement(search).sendKeys(search_text);
	driver.findElement(search_button).click();
	String searchRe = driver.findElement(search_results).getText();
	String[] li = searchRe.split(" ");
	for(String e: li) {
		System.out.println(e);
		if(e.equalsIgnoreCase("'"+search_text+"'")){
				System.out.println("search results appeared correctly");
	}
}
	Thread.sleep(40);
	
		List<WebElement> list1 =  driver.findElements(product_list);
		String value = null;
		//outerloop:
		for(WebElement pname: list1) {
		
			value = pname.getText();
		
			if(value.equalsIgnoreCase(product_name)){
				System.out.println("product name is matched");
				Thread.sleep(40);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(pname)); 
				pname.click();
				break;
				//break outerloop;
			}	
		}
	
}

	
@Test(priority=2)
public void addToCart() throws Exception {
	/*
Scenario 3: Adding Items to Cart
Browse to a product category page
Select a specific product
Add the product to the cart
Verify that the item appears in the cart
	 */
	driver.findElement(size).click();
	driver.findElement(color).click();
	driver.findElement(quantity).sendKeys(quantity_no);
	String beforeAfterAdding = driver.findElement(cartQty).getText();
	//Assert.assertEquals(beforeAfterAdding, "0");
	driver.findElement(cart).click();
	Thread.sleep(50);
	Assert.assertEquals(beforeAfterAdding, quantity_no);
	driver.findElement(cartQty).click();
	driver.findElement(viewandEdit).click();
	Assert.assertEquals(product_name, driver.findElement(cart_name).getText());;
	
	
}
	
	
	
	/*
Scenario 4: Complete and Verify Checkout
Browse to a product category page
Select a specific product
Add the product to the cart
Verify that the item appears in the cart
Continue Checkout and enter checkout details.
Click the Complete Checkout button.
Verify Successful Checkout Button.
	 */
	
}

