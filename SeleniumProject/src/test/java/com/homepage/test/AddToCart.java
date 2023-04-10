package com.homepage.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddToCart {

	
	@Test
	public void display() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHUBHAM\\Desktop\\FaceBook Project\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\");");
    	driver.findElement(By.id("ap_email")).sendKeys("8459816554");
        driver.findElement(By.id("continue")).click(); 
        driver.findElement(By.id("ap_password")).sendKeys("SKahir@2015");    
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("SAMSUNG Galaxy S23");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-medium a-color-base a-text-normal']")).click();
        System.out.println(driver.findElement(By.id("productTitle")).getText());
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
        //driver.findElement(By.cssSelector("#attach-close_sideSheet-link")).click();
        
        //driver.findElement(By.id("#twotabsearchtextbox")).click();
        //driver.findElement(By.id("#twotabsearchtextbox")).sendKeys("SAMSUNG Galaxy S23 back cover");
        driver.close();
        driver.quit();
        
	}
	
}
