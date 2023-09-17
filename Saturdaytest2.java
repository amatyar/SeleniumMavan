package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturdaytest2 {

	public static void main(String[] args) throws InterruptedException {
		//setProperty is a method that implies setting the properties for the browser for creating test cases
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
				//WebDriver is an interface provided by Selenium WebDriver.
				//Interface is a collection of abstract methods(methods without implementation)
				//WebDriver interface acts as a contract that each browser specific driver implements.
				WebDriver driver = new ChromeDriver(); 
				// providing location
				String url = "http://www.webdriveruniversity.com/Popup-Alerts/index.html";
				driver.get(url);
				//Maximize the window
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("#button2 > p")).click();
				Thread.sleep(1000);
				String str = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).getText();
			if(str.equals("It’s that Easy!! Well I think it is.....")) 
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("Test case failed");
			}

	}

}
