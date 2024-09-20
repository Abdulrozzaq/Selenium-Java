package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drcountry=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select country = new Select(drcountry);
		
		//country.selectByValue("uk");
		
		List <WebElement>options=country.getOptions();
		System.out.println(options.size());
		
		for(WebElement count: options) {
			System.out.println(count.getText());
			
		}
		
	}

}
