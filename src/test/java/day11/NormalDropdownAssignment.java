package day11;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalDropdownAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
       
        List<WebElement> options = driver.findElements(By.xpath("(//select[@id='country-list'])[1]/option"));

        // Printing the size of the dropdown options
        System.out.println("Total options in the dropdown: " + options.size());

        // Looping through each option and printing its text
        for (WebElement op : options) {
            System.out.println(op.getText());
        }
        
        // Closing the browser
        driver.quit();
	}
}
