package practiceonlyrevenue;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilities.testBase;
import webPages.flipkartHomepage;
import webPages.homePage;

public class flipkartHomepage_Test {
	testBase tb;
	Properties prop;
	homePage hp;
	flipkartHomepage flphp;

	@BeforeSuite
	public void setup() throws IOException
	{
		tb=new testBase();
		tb.setup();
		hp=new homePage(tb);
		flphp=new flipkartHomepage(tb);
		tb.openUrl();
		
	}

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		
	
	System.out.println("Before method");

	}
	
	@Test
	public void test()
	{
		flphp.closeLoginPopup();
		System.out.println("test");
	}
	
	@Test
	public void tes2t()
	{
		int size=flphp.countWB();
	}
	
	@AfterClass
	public void quit()
	{
		tb.driver.quit();
	}

}
