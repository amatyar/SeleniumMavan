package SeleniumMavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sundayclass {
//Finding the iFrame by index
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			String url = "http://www.webdriveruniversity.com/IFrame/index.html";
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
			boolean display = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
			if(display) {
				System.out.println("Test case outer frame passed.");
			}
			else {
				System.out.println("Test case outer frame failed.");
			}
			
			//Switching back to main page/content.
			driver.switchTo().defaultContent();
			
			//Validating the title of the page inside iFrame
			
			String S1 = driver.getTitle();
			if(S1.equals("WebDriver | IFrame")) {
				System.out.println("Test case  for title passed.");
			}
			else {
				System.out.println("Test case for title failed.");
			}
	}

}
