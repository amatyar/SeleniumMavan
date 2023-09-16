package SeleniumMavan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twopages 
{

	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver(); 
		String url = "http://www.webdriveruniversity.com";
		dr.get(url);
		dr.manage().window().maximize();
		dr.findElement(By.cssSelector("#contact-us")).click();
		String Parent = dr.getWindowHandle();
		System.out.println("Parent window ID  :"+Parent);
		Set<String> windows = dr.getWindowHandles();//
		System.out.println("Both windows :"+windows);
		
		Iterator<String> str = windows.iterator();
		String parentWin = str.next();
		System.out.println("Parent window ID:"+parentWin);
		String child = str.next();
		System.out.println("Child ID:" +child);
		dr.switchTo().window(child);
		
		WebElement wel = dr.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		if(wel.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		//Second cases
		if(dr.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("second Test case passed");
		}
		else
		{
			System.out.println("second Test case failed");
		}
		dr.quit();
	}

}
