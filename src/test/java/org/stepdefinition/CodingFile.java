package org.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utillites.BaseClass1;
import org.utillites.SigninPojo;

import cucumber.api.java.en.*;
import junit.framework.Assert;
import net.bytebuddy.implementation.bytecode.Duplication;

public class CodingFile extends BaseClass1 {
	
	@Given("user should launch chrome and load the page url")
	public void user_should_launch_chrome_and_load_the_page_url() {
		
		Launch();
		winmax();
		pageurl("https://www.newegg.ca/");
		
	    
	}

	@When("user should click the Account button")
	public void user_should_click_the_Account_button() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Stay at Canada']")).click();
		SigninPojo s = new SigninPojo();
		btnclick(s.getSign());
	   
	}

	@When("user should pass valid username and valid password")
	public void user_should_pass_valid_username_and_valid_password() throws InterruptedException {
		
		SigninPojo s = new SigninPojo();
		fill(s.getTxtusr(), "Adhithya18113251@gmail.com");
		s.getSubmit().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fill(s.getTxtpass(), "Adhi@12345");
		
	  
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		SigninPojo s = new SigninPojo();
		btnclick(s.getBtn());
		
	    
	}

	
	@Then("user should logout the Account")
	public void user_should_logout_the_Account() throws InterruptedException {
		SigninPojo s = new SigninPojo();
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeClickable(s.getAcct())).click();
		w.until(ExpectedConditions.elementToBeClickable(s.getLogout())).click();
		browserquit();
	   
	}
	@Given("user should launch the chrome and load the url")
	public void user_should_launch_the_chrome_and_load_the_url() {
		Launch();
		winmax();
		pageurl("https://www.newegg.ca/");
		
	}
	
	@When("User should click the Account button")
	public void User_should_click_the_Account_button() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Stay at Canada']")).click();
		SigninPojo s = new SigninPojo();
		btnclick(s.getSign());
	   
	}


	@When("user should give invalid emaild")
	public void user_should_give_invalid_emaild() {
		

		SigninPojo s = new SigninPojo();
		fill(s.getTxtusr(), "aadhithya18113251@gmail.com");
		
		
	}
	    	

	@When("User should click the sign in button")
	public void user_should_click_the_sign_in_button() {
		SigninPojo s = new SigninPojo();
		s.getSubmit().click();
	}

	@When("user should get invalid emailid error")
	public void user_should_get_invalid_emailid_error() {
		SigninPojo s = new SigninPojo();
		s.pagegettext(s.getError());
		
	
	}
	
	@Then("user should close the browser")
	public void user_should_close_the_browser() {
	   browserquit();


	}
}
