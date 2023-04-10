package com.homepage.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHUBHAM\\Desktop\\FaceBook Project\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\");");
    	driver.findElement(By.id("ap_email")).sendKeys("8459816554");
        driver.findElement(By.id("continue")).click(); 
        driver.findElement(By.id("ap_password")).sendKeys("SKahir@2015");    
        driver.findElement(By.id("signInSubmit")).click(); 
        
        String title =driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        if(title.equals(title)) {
        System.out.print("Correct Title");
        
        }
        else
        {
        System.out.print("Not Correct title");
        }
        
        System.out.print(driver.getCurrentUrl());
        }
        //driver.quit();

	}
