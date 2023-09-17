package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayClass2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver(); 
			
			String url ="https://the-internet.herokuapp.com/javascript_alerts";
			driver.get(url);
			
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
			String text=driver.switchTo().alert().getText();
			if(text.equals("I am a JS Confirm")) {
				System.out.println("Test case for text passed.");
			}
			else {
				System.out.println("Test case for text failed.");
			}
			
			driver.switchTo().alert().dismiss();
			String S1=driver.findElement(By.cssSelector("#result")).getText();
			if(S1.equals("You clicked: Cancel")) {
				System.out.println("Test case passed.");
			}
			else {
				System.out.println("Test case failed.");
			}
	}
	
}
