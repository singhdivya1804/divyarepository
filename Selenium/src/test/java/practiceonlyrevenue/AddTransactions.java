package practiceonlyrevenue;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilities.testBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import webPages.homePage;
public class AddTransactions {
		
public WebDriver driver;
testBase tb;
Properties prop;
homePage hp;

@BeforeSuite
public void setup() throws IOException
{
	tb=new testBase();
	tb.setup();
	hp=new homePage(tb);
	tb.openUrl();
	
}

@BeforeMethod
public void beforeMethod() throws IOException
{
	
	prop=tb.readProp("config");
	String url=prop.getProperty("url");
System.out.println("Before method");

}

@Test(priority=1,groups="sanity")
public void test1()
{
	hp.login();
	System.out.println("test 1");
}

@Test(priority=0,groups="smoke",alwaysRun=false)
public void test2() {
	System.out.println("test 2");
}

@AfterMethod
public void aftermethod()
{
	System.out.println("After Method");
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


