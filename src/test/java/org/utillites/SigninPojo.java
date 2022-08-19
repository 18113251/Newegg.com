package org.utillites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPojo extends BaseClass1 {
	
	
	public SigninPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='Sign In / Register']")
	private WebElement sign;
	
	@FindBy(id="labeled-input-signEmail")
	private WebElement txtusr;
	
	@FindBy(id="signInSubmit")
	private WebElement submit;
	
	@FindBy(id="labeled-input-password")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='SIGN IN']")
	private WebElement btn;

	@FindBy(xpath="(//div[text()='adhi surya'])[1]")
	private WebElement acct;
	
	
	@FindBy(xpath="//a[@title='Sign Out']")
	private WebElement logout;

	@FindBy(xpath="//p[contains(text(),'find an account')]")
    private WebElement error;
	
	
	public WebElement getError() {
		return error;
	}


	public WebElement getSign() {
		return sign;
	}


	public WebElement getTxtusr() {
		return txtusr;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}


	public WebElement getBtn() {
		return btn;
	}


	public WebElement getAcct() {
		return acct;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
