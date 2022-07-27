package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	
	
	public WebDriver driver;
	WebDriverWait wait;
	public Properties prop;
	
	public Properties readProp(String fileName) throws IOException
	{
		prop=new Properties();
		//File file=new File(System.getProperty("user.dir"+"//src//main//java//resources"+fileName+".properties"));
		String pathConfig=System.getProperty("user.dir")+"\\src\\main\\resources\\"+fileName+".properties";
		System.out.println(pathConfig);
		FileInputStream fis=new FileInputStream(pathConfig);
		prop.load(fis);
	
		return prop;
	}
	
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	public void openUrl() throws IOException
	{
		Properties prop1=readProp("config");
		String url=prop1.getProperty("url");
		driver.get(url);
	}


}
