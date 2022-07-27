package webPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.testBase;

public class flipkartHomepage extends testBase{
	//jab ham har webpage ke liye uski ek class banate h to uss architecture ko page object model bolte h
	testBase tb; //testBase class ka reference
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement Btn_closePopup;
	
	
@FindBy(xpath="//img")
List<WebElement> imgWb; //ham ek list banaenge jisme jaise jaise web element milta jaega uska size lelenge
	
	public flipkartHomepage(testBase tb) //ye constructor h ; constructor kabhi bhi static , return type nahi hoga
	{
		this.tb=tb;  //this isme ek reference pointer hota h jo local variable i value global variable mein dalta h
		PageFactory.initElements(tb.driver, this); //ye isliye karte h taki ham findby anottations ke webelements ko initialise karwa sake
	}
	
	public void closeLoginPopup()
	{
		Btn_closePopup.click();
	}
	public int countWB() {
		int size=imgWb.size();
		System.out.println(size);
		return size;
	}
}
