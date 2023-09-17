package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

	public static void main(String[] args) {
		//setProperty is a method that implies setting the properties for the browser for creating test cases
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
				//WebDriver is an interface provided by Selenium WebDriver.
				//Interface is a collection of abstract methods(methods without implementation)
				//WebDriver interface acts as a contract that each browser specific driver implements.
				WebDriver dr = new ChromeDriver(); 
				// providing location
				String url = "http://www.webdriveruniversity.com/Popup-Alerts/index.html";
				dr.get(url);
				//Maximize the window
				dr.manage().window().maximize();
				//find the locator
				dr.findElement(By.cssSelector("#button3")).click();
				//get alert message
				dr.switchTo().alert().accept();
				// test case
				dr.findElement(By.cssSelector("#button1")).click();
				//dr.quit();

	}

}
