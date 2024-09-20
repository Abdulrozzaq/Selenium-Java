package day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		 driver.findElement(By.cssSelector("#next2")).click();
		

	}

}
