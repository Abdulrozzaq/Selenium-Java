package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html# ");
		
		driver.manage().window().maximize();
		
		String value = driver.findElement(By.xpath("//a[contain@(id, 'ite')]")).getText();
		System.out.println(value);
		
		
	}

}
