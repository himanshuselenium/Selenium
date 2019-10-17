import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;


public class FirstTest 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.safari.driver","SafariDriver.safariextz");
		
		WebDriver driver=new SafariDriver();
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://dev.rentology.ca/#");
		
		//join//
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[12]/div/div/div[2]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@type=\"\\\"]")).click();
		driver.findElement(By.xpath("")).click();
		
	
	
	
	
	}
	
	
	}

	
	
	
	
	
	

