package rentology;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver 2");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();


		driver.get("http://www.google.com/");
		driver.get("http://dev.rentology.ca/");
		
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		//Click on sign in
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div[2]/div[2]/a[1]")).click();
		
		//Enter data on email field
		
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("thomas.himanshu@ithands.biz");
		
		//enter password
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd1234");
		
		//Click on sign in
		
		driver.findElement(By.xpath("//*[@id=\"signinKey\"]")).click();
		
		//Click on logout--->One end to end scenario
		
		//driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div[2]/div[2]/a")).click();
		
		//Click on Create Resume
		driver.findElement(By.xpath("//*[@id=\"resumeBlock\"]/div/div/div/a")).click();
		driver.manage().deleteAllCookies();
		
		//Enter First name
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Test");
		
		//Enter last name
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Ithands");
		
		//Enter Phone number
		
		//driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("3453453454");
		
		//Enter DOB
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).sendKeys("94");
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
		
		
		//Gender
		
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
		
		//Enter current address
		
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Pentagon mall haridwar");
		
		//Enter Best way to contact you
		
		//driver.findElement(By.xpath("//*[@id=\"contactMethodID\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"contactMethodID\"]/option[3]")).click();
		
		
		//Enter Pet details
		
		
		driver.findElement(By.xpath("//*[@id=\"pets\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"petsQty\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"petsDesc\"]")).sendKeys("i have pet");
		
		//Enter Do you have kids
		
		//driver.findElement(By.xpath("//*[@id=\"kids\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"kids\"][@id=\"kids\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@name=\"kidsQty\"][@id=\"kidsQty\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"kidsAges\"]")).sendKeys("i am 24s");
		
		//Enter Are you looking for roommates
		
        driver.findElement(By.xpath("//*[@name=\"roommates\"][@id=\"roommates\"]/option[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"roommates\"]/option[2]")).click();
		
		//Do you smoke
		driver.findElement(By.xpath("//*[@id=\"isSmoker\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"isSmoker\"]/option[2]")).click();
		
		
		//How many vehicles you have
		driver.findElement(By.xpath("//*[@id=\"vehiclesQty\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vehiclesQty\"]/option[4]")).click();
		
		//Click on continue
	
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/div/a")).click();

		
		//searching//
		driver.findElement(By.xpath("//*[@id=\"searchField\"]")).sendKeys("tornoto");
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Click on skip button
		
		driver.findElement(By.xpath("//*[@class=\"introjs-button introjs-skipbutton\"]")).click();
	
		// Enter email
		
		//driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("thomas.himanshu@ithands.biz");
				
				
		//driver.findElement(By.xpath("//*[@class=\"btn-news2\"]")).click();
	
	}

}
