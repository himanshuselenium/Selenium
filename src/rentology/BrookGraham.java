package rentology;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrookGraham {

	public static void main(String[] args) 
	{
		
			
			
			System.setProperty("webdriver.chrome.driver","chromedriver 2");
			
			WebDriver driver=new ChromeDriver();
			  driver.get("https://www.crunchbase.com/login");
			  
	
			  driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
				
		//If we the url we are hitting crunchbase.com		
		//		driver.findElement(By.xpath("//*[@class=\"mat-button\"]")).click();
	
	     
				//Email 
				driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("brook@generosityfund.co");
	        
				//Password
				driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("ithands");
				
				//Click on Login button
				
				driver.findElement(By.xpath("//*[@class=\"cb-text-transform-upper mat-raised-button mat-primary\"]")).click();
				
				
				
				
	 
				driver.findElement(By.xpath("//*[@id=\"LKbOtkkWDrnOUAT\"]")).click();
				
				
				
				//Clcik on Search items
				
				driver.get("https://www.crunchbase.com/searches");
				
				driver.findElement(By.xpath("//*[@title=\"It Hands Search 2\"]")).click();
				
				driver.findElement(By.xpath(""));
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
	
	
	}

}
