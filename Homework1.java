package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		//setProperty is a method that implies setting the properties for the browser for creating test cases
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		
		WebDriver dr = new ChromeDriver(); 
		// providing location
		String url = "http://www.webdriveruniversity.com/Popup-Alerts/index.html";
		dr.get(url);
		//Maximize the window
		dr.manage().window().maximize();
		
		dr.findElement(By.cssSelector("#button2 > p")).click();
		Thread.sleep(2000); 
		String dt =dr.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).getText();		
		
		if(dt.equals("It’s that Easy!! Well I think it is.....")) 
		{
			System.out.println("Test case 2 is passed");
		}
		else
		{
			System.out.println("Test case 2 is failed");
		}
		
	}

}
