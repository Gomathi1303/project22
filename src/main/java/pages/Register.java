package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;
import org.openqa.selenium.By;

public class Register extends BaseClass {
	
	
	public Register() {
		
		PageFactory.initElements(driver, this);
	     
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="reg_email__")
	private WebElement phoneno ;
	
	@FindBy(name="reg_passwd__")
	private WebElement newpass ;
	
	@FindBy(id="day")
	private WebElement drpday;
	
	@FindBy(id="month")
	private WebElement drpmonth;
	
	@FindBy(id="year")
	private WebElement drpyear;
	
	@FindBy(xpath="(//input[@value=\"1\"])")
	private WebElement button;
	
	@FindBy(name="websubmit")
	private WebElement submit;
	

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	public WebElement getDrpday() {
		return drpday;
	}

	public WebElement getDrpmonth() {
		return drpmonth;
	}

	public WebElement getDrpyear() {
		return drpyear;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getSubmit() {
		return submit;


	}
	
	

	
	
	
	

}
