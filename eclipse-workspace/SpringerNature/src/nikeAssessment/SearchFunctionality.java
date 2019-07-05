package nikeAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionality {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\david\\eclipse-workspace\\TestAuto\\libs2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://rd.springer.com/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.findElement(By.id("query")).sendKeys("Books");
			driver.findElement(By.id("search")).click();
			driver.close();
			}			
	
	}


