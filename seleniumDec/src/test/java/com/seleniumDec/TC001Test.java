package com.seleniumDec;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC001Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC001() {
    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(945, 1012));
    driver.findElement(By.id("btn-make-appointment")).click();
    driver.findElement(By.cssSelector(".col-sm-8:nth-child(2) > .input-group > .form-control")).click();
    driver.findElement(By.id("txt-username")).click();
    driver.findElement(By.id("txt-username")).sendKeys("John Doe");
    driver.findElement(By.cssSelector(".col-sm-offset-4 > .input-group")).click();
    driver.findElement(By.id("txt-password")).click();
    driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
    driver.findElement(By.id("btn-login")).click();
    js.executeScript("window.scrollTo(0,500)");
    driver.findElement(By.id("combo_facility")).click();
    driver.findElement(By.id("radio_program_medicaid")).click();
    driver.findElement(By.id("radio_program_medicare")).click();
    driver.findElement(By.cssSelector(".glyphicon")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > .day:nth-child(4)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > .day:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    driver.findElement(By.id("txt_comment")).click();
    driver.findElement(By.id("txt_comment")).sendKeys("Not applicable");
    driver.findElement(By.id("btn-book-appointment")).click();
    driver.findElement(By.cssSelector("h2")).click();
    driver.findElement(By.cssSelector(".lead")).click();
    driver.findElement(By.cssSelector(".col-xs-offset-2:nth-child(2) > .col-xs-8")).click();
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(1)")).click();
    Assert.assertEquals(driver.findElement(By.cssSelector(".lead")).getText(), "Please be informed that your appointment has been booked as following:");
    driver.findElement(By.id("visit_date")).click();
    driver.findElement(By.linkText("Go to Homepage")).click();
    driver.close();
  }
}
