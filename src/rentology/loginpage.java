package rentology;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class loginpage 
{

WebDriver driver;

public void invokeChBrowser() 
{

   // For the Chrome Browser	
	
	System.setProperty("webdriver.chrome.driver", "/Users/ryansagar/Documents/Testproject/chromedriver");

	driver = new ChromeDriver();

	//	driver.manage().window().maximize();

	 driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
     driver.get("https://staging.servotechusa.com/");
     
     String title = driver.getTitle();

     System.out.println(title);   

     driver.quit();

}

public void invokeFfBrowser() {

	// For the Firefox Browser	   
   
	System.setProperty("webdriver.gecko.driver", "geckodriver");

	//	System.setProperty("webdriver.firefox.marionette", "geckodriver");
          driver = new FirefoxDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
          driver.get("https://staging.servotechusa.com/");

}
     public void invokeSafariBrowser() {

         driver = new SafariDriver();
         driver.get("https://westport.mediafuel.net/");
         driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
         driver.quit();


}




     public static void main(String[] args) {


    	 loginpage lp = new loginpage();
  
    	 lp.invokeChBrowser();

    	 //	lp.invokeFfBrowser();

    	 //	lp.invokeSafariBrowser();



}

}


