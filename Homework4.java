package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {

	public static void main(String[] args) 
	{
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
		dr.findElement(By.cssSelector("#button4")).click();
		//get alert message
		String s1= dr.switchTo().alert().getText();
		// test case
		if(s1.equals("Press a button!")) {
			System.out.println("Test case pass 0");
		}
		else
		{
			System.out.println("Test case fail 0");
		}
//		dr.switchTo().alert().accept();
//		String s2=  dr.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		if(s2.equals("You pressed OK!")) {
//			System.out.println("Test case Pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		// i want canceled 
		dr.switchTo().alert().dismiss();;
		String s2=  dr.findElement(By.cssSelector("#confirm-alert-text")).getText();
		if(s2.equals("You pressed Cancel!")) {
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}

}
