package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayClass4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		String url ="https://the-internet.herokuapp.com/javascript_alerts";
		driver.get(url);
		
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text=driver.switchTo().alert().getText();
		if(text.equals("I am a JS prompt")) {
			System.out.println("Test case for text passed.");
		}
		else {
			System.out.println("Test case for text failed.");
		}
		
		driver.switchTo().alert().sendKeys("Boston , Massachussett");
		driver.switchTo().alert().dismiss();
		
		String text2=driver.findElement(By.cssSelector("#result")).getText();
		if(text2.equals("You entered: null")) {
			System.out.println("Test case passed.");
			
		}
		else {
			System.out.println("Test case failed.");
		}
	}

}
