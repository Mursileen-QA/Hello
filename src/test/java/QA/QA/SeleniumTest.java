package QA.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void browsertest() {
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
         WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/upload/");
        
        
        
        driver.findElement(By.id("uploadfile_0")).sendKeys("/home/musileenkumar/Desktop/QA/sample-usa-passport.jpg");
     // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}
	

}