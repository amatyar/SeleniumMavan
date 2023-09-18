package SeleniumMavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkForTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			String url ="http://www.webdriveruniversity.com/Data-Table/index.html";
			driver.get(url);
			driver.manage().window().maximize();
			List<WebElement> table1 = driver.findElements(By.xpath("//*[table]"));
			int tab = table1.size();
			System.out.println("Number of Tables\t"+tab);
			
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
			int T_Rows= rows.size();
			System.out.println("Number of Rows\t"+T_Rows);
			
			List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
			int T_Column = column.size();
			System.out.println("Number of Columns\t"+T_Column);
			
			int sum = 0;
		
			for (int i = 2; i <= T_Rows; i++)
			{
				System.out.println(i);
				String tx = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
				System.out.println(tx);
				sum +=Integer.parseInt(tx);
				
				
			}
			System.out.println("Total age \t"+sum);
			System.out.println("Average age: \t" + sum / (rows.size()-1));
			
			//find First Name
			for(int i =2; i <= T_Rows; i++) 
			{
				String txt = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(txt);
				if(txt.equals("Michael")) 
				{
					System.out.println("Test case passed");
					break;
				}
			}
			//find last name
			
			for(int i =2; i <= T_Rows; i++) 
			{
				String txt1 = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(txt1);
				if(txt1.equals("Doe")) 
				{
					System.out.println("Test case passed");
					break;
				}
			}
			
	}
}
