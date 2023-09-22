package SeleniumMavan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEngine {

	public static void main(String[] args) {
		Properties prope = new Properties();
		String path = "C:\\Users\\Rabindra\\eclipse-workspace\\SeleniumProject\\src\\SeleniumMavan\\config.properties";
		
		try {
			FileInputStream fileInput = new FileInputStream(path);
			try {
				prope.load(fileInput);
				String url = prope.getProperty("baseUrl");
				String browser = prope.getProperty("browser");
				String Username = prope.getProperty("username");
				String Password = prope.getProperty("password");
				//write some words to file
				prope.put("City ", "Braintree, MA");
				FileOutputStream output = new FileOutputStream(path);
				//storing the properties file
				prope.store(output, "this is more intersting case of study.");
				
				
				
				if(browser.equals("chrome")) 
				{
					//setup browser chrome 
					System.setProperty("webdriver.chrome.driver", 
							"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
					WebDriver dr = new ChromeDriver(); 
					dr.get(url);
					dr.findElement(By.cssSelector("#user-name")).sendKeys(Username);
					dr.findElement(By.cssSelector("#password")).sendKeys(Password);
					dr.findElement(By.cssSelector("#login-button")).click();
					
					if(dr.getCurrentUrl().contains("inventory")) {
						System.out.println("Test case pass");
					}
					else
					{
						System.out.println("Test case Fail");
					}
					dr.close();
				}
				else if(browser.equals("firefox"))
				{
					// code herefor setup firefox
				}
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}
		
	}
}
