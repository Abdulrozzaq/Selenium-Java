package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		Thread.sleep(5000);
		
		List <WebElement>option=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println(option.size());
		
		for(WebElement opt :option) {
			
		System.out.println(opt.getText());
			
		}
		
		for(WebElement opt :option){
			
			String options = opt.getText();
			
			if(options.equals("C#") || options.equals("Python") || options.equals("MySQL")){
				opt.click();
			}
		}

	}

}
