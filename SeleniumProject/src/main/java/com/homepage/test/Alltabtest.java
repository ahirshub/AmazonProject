package com.homepage.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alltabtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHUBHAM\\Desktop\\FaceBook Project\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\");");
    	driver.findElement(By.id("ap_email")).sendKeys("8459816554");
        driver.findElement(By.id("continue")).click(); 
        driver.findElement(By.id("ap_password")).sendKeys("SKahir@2015");    
        driver.findElement(By.id("signInSubmit")).click(); 
        driver.findElement(By.cssSelector(".hm-icon-label")).click();
    	Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("div[id='hmenu-customer-name'] b")).getText());
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".nav-sprite.hmenu-close-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".nav-a[href='/gp/goldbox?ref_=nav_cs_gb']")).click();
	    System.out.println(driver.findElement(By.cssSelector(".nav-a[href='/gp/goldbox?ref_=nav_cs_gb']")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".nav-a[href='/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell']")).click();
	    System.out.println(driver.findElement(By.cssSelector(".heading.align-start.font-size-medium.color-squid-ink.ember.font-heavy")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".nav-a[href='/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again']")).click();
	    System.out.println(driver.findElement(By.cssSelector("h1[class='a-spacing-medium']")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.id("nav-your-amazon-text")).click();
	    System.out.println(driver.findElement(By.cssSelector(".a-size-large.a-spacing-base")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".nav-a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
	    System.out.println(driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(1) div:nth-child(1) h1:nth-child(1)")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".nav-a[href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry']")).click();
	    System.out.println(driver.findElement(By.cssSelector(".a-link-normal.gr-btn.gr-btn--rounded.gr-text.gr-text--sm.gr-hero__cta.gr-home-btn.a-button-primary")).getText());
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("a[id='nav-recently-viewed'] span:nth-child(1)")).click();
	    System.out.println(driver.findElement(By.cssSelector(".a-size-large.a-color-information")).getText());
	
	}

}
