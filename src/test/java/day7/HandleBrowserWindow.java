package day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set <String> windowID= driver.getWindowHandles();
		
		//List <String> windowList = new ArrayList(windowID);
		 
		/*
		String ParentID = windowList.get(0);
		String ChildID = windowList.get(1);
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		*/
		
		//APPROACH 2
		
		for ( String wind : windowID) {
			String title=driver.switchTo().window(wind).getTitle();
			
			if(title.equals("https://www.orangehrm.com/")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
