package SeleniumMavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame011 {
//https://www.h2kinfosys.com/blog/handling-iframes-in-selenium-webdriver/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.dezlearn.com/iframe-example/");

	    
	//Finding all iframe tags on a web page  
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	     int numberOfTags = elements.size();
	     System.out.println("No. of Iframes of the Web Page: " +numberOfTags);
	      
	// Switch to the frame using the frame id
	     driver.switchTo().frame("contact-iframe");
	    

	// Switch back to main web page
	driver.switchTo().defaultContent();

	   
	     driver.quit();
	}

}
