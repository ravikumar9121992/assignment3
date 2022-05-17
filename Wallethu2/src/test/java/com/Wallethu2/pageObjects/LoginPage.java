package com.Wallethu2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="em")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="pw1")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="pw2")
	@CacheLookup
	WebElement txtPassword2;
	
	@FindBy(xpath="/html/body/main/div/form/div/div[4]/label/span")
	@CacheLookup
	WebElement checkbox1;
	
	@FindBy(xpath="/html/body/main/div/form/div/div[6]/button")
	@CacheLookup
	WebElement joinbtn;
	
	
	@FindBy(xpath="(//*[local-name()='svg'][@height=\"35.72\"])[4]")
	@CacheLookup
	WebElement fourreview;
	
	@FindBy(xpath="/html/body/web-app/div/div[1]/main/div[2]/div/div[3]/section/modal-dialog/div/div/write-review/div[2]/ng-dropdown/div/span[1]")
	@CacheLookup
	WebElement selectdropdown;
	
	
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setPassword2(String pwd)
	{
		txtPassword2.sendKeys(pwd);
	}
	
	public void chckbox()
	{
		checkbox1.click();
	}
	
	public void joinbutton()
	{
		joinbtn.click();
	}
	

	public void review()
	{
		fourreview.click();
	}
	
	public void dropdown() throws InterruptedException
	{
		Select aaa = new Select(selectdropdown);
		aaa.selectByVisibleText("Health Insurance");
	}
	
	
	
	
	
	
}









