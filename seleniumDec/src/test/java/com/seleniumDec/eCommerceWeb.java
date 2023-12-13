package com.seleniumDec;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	String product_name = "Nora Practice Tank";
	By cart = By.xpath("//button[@title='Add to Cart']");
	By price = By.xpath("//div[@class='product-info-price']//span[@class='price']");
	By size = By.xpath("//div[@class='swatch-option text' and @index='2']");
	By color = By.xpath("//div[@class='swatch-option color' and @index='1']");
	By color_text = By.xpath("//div[@class='swatch-attribute color']/span[@class='swatch-attribute-selected-option']");
	By quantity = By.xpath("//input[@id='qty']");
	String quantity_no = "2";
	By cartQty = By.xpath("//span[@class='counter-label']");
	By cartClick = By.xpath("//a[@class='action showcart']/span[@class='counter qty']");
	By viewandEdit = By.xpath("//a[@class='action viewcart']/span");
	//product item cart page
	By cart_name = By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td/div/strong/a");
	By cart_size = By.xpath("//dd[contains(text(),'M')]");
	By cart_color = By.xpath("//dd[contains(text(),'Purple')]");
	By cart_qty = By.xpath("//table[@id='shopping-cart-table']//span[@class='label']/following-sibling::input");
	By cart_price = By.xpath("//table[@id='shopping-cart-table']//td[@class='col price']//span[@class='price']");
	int cart_price_in, cart_qty_in, cart_sub , cart_subtotal_in;
	String ccart_qty, ccart_price,  ccart_subtotal,  ex_size , ex_color, cccart_price;
	By cart_subtotal = By.xpath("//table[@id='shopping-cart-table']//td[@class='col subtotal']//span[@class='price']");
	
	
	
@Test(priority=0)
	public void Login() throws Exception {
	/*
Scenario 1: Login
Navigate to the login page
Fill in the required fields with valid data
Submit the login form
Verify the successful login message or the user's profile page
	 */
	driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
	driver.findElement(signin).click();
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(pass).sendKeys(password);
	driver.findElement(signinB).click();
	Thread.sleep(3000);
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
		//System.out.println(e);
		if(e.equalsIgnoreCase("'"+search_text+"'")){
				System.out.println("search results appeared correctly");
	}
}
	Thread.sleep(40);
	
		List<WebElement> list1 =  driver.findElements(product_list);
		String value = null;
		//outerloop:
		try {
			outer:
			for(WebElement pname: list1) {
			
				value = pname.getText();
			
				if(value.equalsIgnoreCase(product_name)){
					System.out.println("product name "+value+ " is matched");

				//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//wait.until(ExpectedConditions.elementSelectionStateToBe(pname, true)); 
					Thread.sleep(4000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(pname)); 
					pname.click();
					break outer;
					//break outerloop;
				}
				
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
}

@Test(priority=2, dependsOnMethods = "search")
public void addToCart() throws Exception {
	/*
Scenario 3: Adding Items to Cart
Browse to a product category page
Select a specific product
Add the product to the cart
Verify that the item appears in the cart
	 */
Thread.sleep(4000);
ex_size = driver.findElement(size).getText();
		//System.out.println(ex_size);//
	driver.findElement(size).click();
	
		driver.findElement(color).click();
	ex_color = driver.findElement(color_text).getText();
	//System.out.println(ex_color);//
	
	String pprice = driver.findElement(price).getText();
	//System.out.println(pprice);
	
	driver.findElement(quantity).clear();
	driver.findElement(quantity).sendKeys(quantity_no);
	
	//Assert.assertEquals(beforeAfterAdding, "0");
	driver.findElement(cart).click();
	Thread.sleep(6000);
	String cartNo = driver.findElement(cartQty).getText();
	System.out.println("number in the cart is "+cartNo);
	//Assert.assertEquals(cartNo, quantity_no);
	driver.findElement(cartClick).click();
	driver.findElement(viewandEdit).click();
	
	//System.out.println(product_name);
	//System.out.println(driver.findElement(cart_name).getText());
	Assert.assertEquals(product_name, driver.findElement(cart_name).getText());
	
	//System.out.println(ex_size);
	//System.out.println(driver.findElement(cart_size).getText());
	Assert.assertEquals(ex_size, driver.findElement(cart_size).getText());
	
	//System.out.println(ex_color);
	//System.out.println(driver.findElement(cart_color).getText());
	Assert.assertEquals(ex_color, driver.findElement(cart_color).getText());
	
	driver.findElement(cart_qty).click();
	 ccart_qty = driver.findElement(cart_qty).getAttribute("value");
	//System.out.println(ccart_qty);
	//System.out.println(quantity_no);
	Assert.assertEquals(quantity_no,ccart_qty );

	 ccart_price = driver.findElement(cart_price).getText();
		  
	 
	//System.out.println(ccart_price);
	
	Assert.assertEquals(pprice, ccart_price);
}


@Test(priority=3, dependsOnMethods = "addToCart")
public void subtotal() {
	 String[] lin = ccart_price.split(".");
for(int i=0; i<lin.length; i++) {
	 System.out.println(lin[i]);}

//	  cccart_price = lin[0].substring(1, lin.length);
	/* 
	cart_price_in  = Integer.parseInt(cccart_price);
		 cart_qty_in  = Integer.parseInt(ccart_qty);
		cart_sub = cart_price_in * cart_qty_in;
		System.out.println("Total is " +cart_sub);
		 ccart_subtotal = driver.findElement(cart_subtotal).getText();
		 cart_subtotal_in = Integer.parseInt(ccart_subtotal);
	Assert.assertEquals(cart_subtotal_in, cart_sub);
	*/
	
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


