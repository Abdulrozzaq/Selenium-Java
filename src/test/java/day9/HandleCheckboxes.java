package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox'] "));
		/*for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		*/
		
		// click the last 3 of the checkboxes(formula checkboxessize - the last 3 i.e 7-3=4)
		
		for(int i=4; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
	

	}

}
