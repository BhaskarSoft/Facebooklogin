package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class face {
 static WebDriver d;
 
	
    @Test
    public void test()
    {
    	System.setProperty("webdriver.chrome.driver","E:\\Bhaskar\\A QT Mar17\\SeleniumDrivers\\chromedriver.exe");
	    d =new ChromeDriver();
    	d.get("https://www.facebook.com/");
    	d.findElement(By.id("email")).sendKeys("vvhjvhjvhjv");
		 d.findElement(By.id("pass")).sendKeys("asdf");
    }
		
	

}
