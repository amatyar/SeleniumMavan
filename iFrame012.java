package SeleniumMavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame012 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.stqatools.com");

		// Click on link to open iFrame
		driver.findElement(By.id("iFrame_Name")).click();

		// Switch to Frame
		driver.switchTo().frame("iframe");

		// Perform operation on Frame
		driver.findElement(By.id("tinymce")).sendKeys("Text_To_frame");

		// Switch back to defaultContent
		driver.switchTo().defaultContent();

		// Switch between one frame to another
		driver.switchTo().frame("iframe_1").switchTo().frame("iframe_2");


	}

}
