package day5;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebdriverMethod {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(5000);
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	Set<String> windowIds=driver.getWindowHandles();
	
	System.out.println(windowIds);
	
	
	//driver.quit();
	
	

	}

}
