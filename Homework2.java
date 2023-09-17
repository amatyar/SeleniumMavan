package SeleniumMavan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		//setProperty is a method that implies setting the properties for the browser for creating test cases
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
				//WebDriver is an interface provided by Selenium WebDriver.
				//Interface is a collection of abstract methods(methods without implementation)
				//WebDriver interface acts as a contract that each browser specific driver implements.
				WebDriver driver = new ChromeDriver(); 

		// Maximize the browser
        driver.manage().window().maximize();
    
        // Launch Website
        driver.get("https://demoqa.com/alerts");       
     
     
        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
        
        driver.switchTo().alert().sendKeys("Happy Friday");
		driver.switchTo().alert().accept();
		String newtxt=driver.findElement(By.cssSelector("#promptResult")).getText();
		if(newtxt.equals("You entered Happy Friday")) 
		{
			System.out.println("Test case passed.");
			
		}
		else 
		{
			System.out.println("Test case failed.");
		}
        
      //*[@id="confirmButton"]
      //*[@id="alertButton"]
      //*[@id="promtButton"]
      //*[@id="timerAlertButton"]
        
	}

}
