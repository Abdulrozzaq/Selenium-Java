package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		
		// Navigate to the login page
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        // Log in
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        // Navigate to PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        
        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Full-Time Permanent']")).click();
		
		List <WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		
		
		for(WebElement opy: options) {
			
			System.out.println(opy.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement dcolors=driver.findElement(By.xpath("//select[@id='colors']"));
		
		Select colors = new Select(dcolors);
		
		colors.selectByValue("green");
		colors.selectByValue("white");
		colors.selectByValue("blue");
		
		List <WebElement> options = colors.getOptions();
		System.out.println(options.size());
		
		for(WebElement col :options) {
			
			System.out.println(col.getText());
		}*/
		
		
		
		
	}

}
