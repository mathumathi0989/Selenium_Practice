package com.seleniumDec;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerceWeb extends browserCl {

	String emailid = "mathu@gmail.com";
	String password = "Success@1";
	String search_text = "tank";
	String product_name = "Nora Practice Tank";
	String quantity_no = "2";
	String address = "123 abc";
	String city = "salem";
	String country_value = "37";
	String zip = "12345";
	String phone = "1234567890";
	By size = By.xpath("//div[@class='swatch-option text' and @index='2']");
	By color = By.xpath("//div[@class='swatch-option color' and @index='1']");
	int cart_price_in, cart_qty_in, cart_sub , cart_subtotal_in,cart_check_subtotal_in,ship_total_amount_in;
	String ccart_qty, ccart_price,  ccart_subtotal,  ex_size , ex_color, cccart_price,  vval,vvalu,cccart_subtotal, del_text,cccart_check_subtotal,ccart_check_subtotal,vvalue ,ship_total_full, vvalueShip,ship_total_amount;
	String actu_placed_text,act_placed_order;
	String exp_del_text = "You have no items in your shopping cart.";
	String exp_placed_text = "Thank you for your purchase!";
	
	By signin = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By email = By.id("email");
	By pass = By.id("pass");
	By signinB = By.id("send2");
	By name = By.xpath("//div[@class='panel header']//span[@class='logged-in']");
	By search = By.id("search");
	By search_button = By.xpath("//div[@class='actions']/button[@type='submit']");
	By search_results = By.xpath("//span[@class='base']");
	By product_list = By.xpath("//a[@class='product-item-link']");
	By cart = By.xpath("//button[@title='Add to Cart']");
	By price = By.xpath("//div[@class='product-info-price']//span[@class='price']");
	By color_text = By.xpath("//div[@class='swatch-attribute color']/span[@class='swatch-attribute-selected-option']");
	By quantity = By.xpath("//input[@id='qty']");
	By cartQty = By.xpath("//span[@class='counter-label']");
	By cartClick = By.xpath("//a[@class='action showcart']/span[@class='counter qty']");
	By viewandEdit = By.xpath("//a[@class='action viewcart']/span");
	//product item cart page
	By cart_name = By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td/div/strong/a");
	By cart_size = By.xpath("//dd[contains(text(),'M')]");
	By cart_color = By.xpath("//dd[contains(text(),'Purple')]");
	By cart_qty = By.xpath("//table[@id='shopping-cart-table']//span[@class='label']/following-sibling::input");
	By cart_price = By.xpath("//table[@id='shopping-cart-table']//td[@class='col price']//span[@class='price']");
	By cart_subtotal = By.xpath("//table[@id='shopping-cart-table']//td[@class='col subtotal']//span[@class='price']");
	By cart_checkout_total = By.xpath("//table[@class='data table totals']//tr[@class='grand totals']/td[@class='amount']");
	//span[@data-bind='text: getValue()'][normalize-space()='$78.00']
	//delete item cart page
	By cart_del = By.xpath("//div[@class='actions-toolbar']//a[@title='Remove item']");
	By cart_del_text = By.xpath("//div[@class='cart-empty']/p[contains(text(),'no')]");
	//checkout 
	By check_Btn = By.xpath("//li[@class='item']/button[@title='Proceed to Checkout']");
	//shipping
	By ship_addr = By.xpath("//input[@id='G7JIJSA']");
	By ship_city = By.xpath("//input[@id='X7I9QRU']");
	By ship_country = By.xpath("//select[@id='ULXYDSP']");
	By ship_zip = By.xpath("//input[@id='LOVOU3V']");
	By ship_phone = By.xpath("//input[@id='L8IVCQT']");
	By ship_method = By.xpath(" //input[@name='ko_unique_1']");
	By ship_next = By.xpath("//span[normalize-space()='Next']");
	By ship_total = By.xpath("//tr[@class='grand totals']//span[@class='price']");
	By ship_place = By.xpath("//button[@title='Place Order']");
	//after placing order
	By placed_text = By.xpath("//h1[@class='page-title']/span");
	By placed_order = By.xpath("//a[@class='order-number']/strong");
	By ship_already = By.xpath("//div[@class='shipping-address-items']");

			
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
		if(e.equalsIgnoreCase("'"+search_text+"'")){
				System.out.println("search results appeared correctly");
	}
}
	Thread.sleep(40);
	
		List<WebElement> list1 =  driver.findElements(product_list);
		String value = null;
		try {
			outer:
			for(WebElement pname: list1) {
			
				value = pname.getText();
			
				if(value.equalsIgnoreCase(product_name)){
					System.out.println("product name "+value+ " is matched");
		Thread.sleep(4000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(pname)); 
					pname.click();
					break outer;
				}		
			}
		} catch (InterruptedException e1) {
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
	driver.findElement(size).click();
		driver.findElement(color).click();
	ex_color = driver.findElement(color_text).getText();
	String pprice = driver.findElement(price).getText();
	driver.findElement(quantity).clear();
	driver.findElement(quantity).sendKeys(quantity_no);
	driver.findElement(cart).click();
	Thread.sleep(6000);
	String cartNo = driver.findElement(cartQty).getText();
	System.out.println("number in the cart is "+cartNo);
	driver.findElement(cartClick).click();
	driver.findElement(viewandEdit).click();
	Assert.assertEquals(product_name, driver.findElement(cart_name).getText());
	Assert.assertEquals(ex_size, driver.findElement(cart_size).getText());
	Assert.assertEquals(ex_color, driver.findElement(cart_color).getText());
	driver.findElement(cart_qty).click();
	 ccart_qty = driver.findElement(cart_qty).getAttribute("value");
	Assert.assertEquals(quantity_no,ccart_qty );
 ccart_price = driver.findElement(cart_price).getText();
	Assert.assertEquals(pprice, ccart_price);
}


@Test(priority=3, dependsOnMethods = "addToCart")
public void subtotal() {
	 String[] lin = ccart_price.split("\\.");
for(int i=0; i<lin.length; i++) {
	 vval = lin[0];
}
cccart_price = vval.substring(1);
	cart_price_in  = Integer.parseInt(cccart_price);
		 cart_qty_in  = Integer.parseInt(ccart_qty);
		cart_sub = cart_price_in * cart_qty_in;
		 ccart_subtotal = driver.findElement(cart_subtotal).getText();
		 	 String[] lind = ccart_subtotal.split("\\.");
for(int i=0; i<lin.length; i++) {
	 vvalu = lind[0];
}
cccart_subtotal = vvalu.substring(1);
		 cart_subtotal_in = Integer.parseInt(cccart_subtotal);
	Assert.assertEquals(cart_subtotal_in, cart_sub);	
	
	ccart_check_subtotal = driver.findElement(cart_checkout_total).getText();
	String[] lind1 = ccart_check_subtotal.split("\\.");
for(int i=0; i<lind1.length; i++) {
	 vvalue = lind1[0];
}
cccart_check_subtotal = vvalue.substring(1);
		 cart_check_subtotal_in = Integer.parseInt(cccart_check_subtotal);
	Assert.assertEquals(cart_check_subtotal_in, cart_subtotal_in);
}



public void deleteCart() {
/*
Scenario 4: Delete the cart items
	 */
driver.findElement(cart_del).click();
 del_text = driver.findElement(cart_del_text).getText();
 Assert.assertEquals(del_text, exp_del_text);



}


@Test(priority=4, dependsOnMethods = "subtotal")
public void checkout() throws Exception {
	/*
Scenario 5: Complete and Verify Checkout
Continue Checkout and enter checkout details.
Click the Complete Checkout button.
Verify Successful Checkout Button.
	 */
 driver.findElement(check_Btn).click();
 Thread.sleep(5000);
 
 if((driver.findElement(ship_already).isDisplayed())==false) {
	
 driver.findElement(ship_addr).sendKeys(address);
 driver.findElement(ship_city).sendKeys(city);
 
 Select s = new Select(driver.findElement(ship_country));
 s.selectByValue(country_value);
 
  driver.findElement(ship_zip).sendKeys(zip);
 driver.findElement(ship_phone).sendKeys(phone);
 
 }
	driver.findElement(ship_method).isSelected();
 
 
 driver.findElement(ship_next).click();
 Thread.sleep(3000);
 
ship_total_full = driver.findElement(ship_total).getText();
 	String[] lind2 = ship_total_full.split("\\.");
for(int i=0; i<lind2.length; i++) {
	 vvalueShip = lind2[0];
}
ship_total_amount = vvalueShip.substring(1);
		 ship_total_amount_in = Integer.parseInt(ship_total_amount);
	Assert.assertEquals(ship_total_amount_in, cart_subtotal_in);

 driver.findElement(ship_place).click();
 Thread.sleep(3000);
actu_placed_text =  driver.findElement(placed_text).getText();
 Assert.assertEquals(actu_placed_text, exp_placed_text);
 
 act_placed_order = driver.findElement(placed_order).getText();
 System.out.println("Your order number is: " +act_placed_order);
 
}



}


