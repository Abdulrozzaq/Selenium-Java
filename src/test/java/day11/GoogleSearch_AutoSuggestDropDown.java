package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("selenium");//search
        Thread.sleep(5000);
        
        List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println("suggestion search size " + list.size());
        
        for(WebElement lis : list) {
        	
        System.out.println(lis.getText());
        
        	if(lis.getText().equalsIgnoreCase("selenium")){
        		
        		lis.click();
        		
        	}
        	break;
        
        
        }
		
		
	}

}
