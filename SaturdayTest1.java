package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaturdayTest1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver(); 
		// providing location
		String url = "http://www.webdriveruniversity.com/Popup-Alerts/index.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#button1 > p")).click();
		//I am an alert box!
		String str = driver.switchTo().alert().getText();
		if(str.equals("I am an alert box!"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.close();

	}

}
