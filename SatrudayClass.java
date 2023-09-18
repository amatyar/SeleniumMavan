package SeleniumMavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SatrudayClass {

	public static void main(String[] args) {
		// Tables 
		
				// Get the total number of tables 
				// Get the total number of rows 
				// Get the total number of columns
				// Iterate rows and columns and print text of element 
				// Convert it into integer and add
				
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver(); 
				// visiting the url
				driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
				
				// Getting total number of rows 
				List<WebElement> tbl = driver.findElements(By.xpath("//*[table]"));
				//driver.findElements(By.cssSelector("table"));
				
				System.out.println(tbl.size());
				// Getting total number of columns 
				
				List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
				int totalRows = rows.size();
				System.out.println(rows.size());
				
				
				List<WebElement>  columns = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
				int totalColums = columns.size();
				System.out.println(totalColums);
				
				////*[@id="t01"]/tbody/tr[2]/td[3]
				int sum = 0;
				
				for(int i = 2 ; i <= totalRows ; i++) {
					
					//*[@id="t01"]/tbody/tr[i]/td[3]
					System.out.println(i);
					String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
					System.out.println(text);
					sum = sum + Integer.parseInt(text);
					
				
					
				}
				System.out.println(sum);
				
				// find the person with Michael
				
				
				for(int i = 2 ; i <= totalRows ; i++) {
					String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
					System.out.println(text);
					if(text.equals("Michael")) {
						System.out.println("Test case pass ");
						break;
					}
				}
// find first name and last name ??? home work
				
	}

}
