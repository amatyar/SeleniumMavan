package SeleniumMavan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver(); 
		String url = "http://www.webdriveruniversity.com";
		dr.get(url);
		dr.manage().window().maximize();
		String p_Window = dr.getWindowHandle();
		dr.findElement(By.xpath("//*[@id=\"contact-us\"]")).click();
		dr.findElement(By.id("contact-us")).click();
		dr.findElement(By.id("login-portal")).click();
		dr.findElement(By.id("button-clicks")).click();
		dr.findElement(By.id("to-do-list")).click();
		dr.findElement(By.id("page-object-model")).click();
		dr.findElement(By.id("file-upload")).click();
		dr.findElement(By.id("contact-us")).click();
		dr.findElement(By.id("login-portal")).click();
		Set<String> win = dr.getWindowHandles();
		System.out.println(win);
		// Iterator using 
		Iterator <String> str = win.iterator();
		
		while(str.hasNext())
		{
			String window = str.next();
			dr.switchTo().window(window);
			if(dr.getTitle().equals("WebDriver | Button Clicks")) {
				System.out.println(dr.getTitle());
				System.out.println("Test case passed");
				break;
			}
		}
			dr.quit();
	}

}
