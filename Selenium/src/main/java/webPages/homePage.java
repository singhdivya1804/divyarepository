package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.testBase;

public class homePage extends testBase{
	testBase tb;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement btnLogin;

	public homePage(testBase tb)
	{
		this.tb=tb;
		PageFactory.initElements(tb.driver, this);
	}
	
	public void login() {
		if(btnLogin.isDisplayed()) {
		btnLogin.click();}
	}

}
