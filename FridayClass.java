package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayClass 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver(); 
		
		dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		dr.manage().window().maximize();
		WebElement abc = dr.findElement(By.id("result"));
		dr.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		String strAlert = dr.switchTo().alert().getText();
		if(strAlert.equals("I am a JS Alert")) {
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		dr.switchTo().alert().accept();
		
		if(abc.getText().equals("You successfully clicked an alert"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}

	}

}
