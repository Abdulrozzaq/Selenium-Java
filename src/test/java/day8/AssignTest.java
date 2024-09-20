package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("gun");
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));	
		
		int numlink = links.size();
		
		System.out.println("number of link avalibale of website is " + numlink);
		
		for(WebElement link : links) {
			if (link.isDisplayed() && link.isEnabled()) {
				link.click();
			} else {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", link);
			}
		}

	}

}
