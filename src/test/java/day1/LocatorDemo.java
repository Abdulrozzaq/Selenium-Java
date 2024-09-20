package day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		List  <WebElement> linkdriver =driver.findElements(By.tagName("a"));
		System.out.println(linkdriver.size());
		for(WebElement links : linkdriver) {
			
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
			 
		}
		//List  <WebElement> image =driver.findElements(By.tagName("img"));
		//System.out.println(image.size());
	
		
		//driver.findElement(By.linkText("Contact")).click();
		
		
	}

}
