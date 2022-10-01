package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/");
				driver.switchTo().frame(driver.findElement(By.xpath("")));
	}
}
