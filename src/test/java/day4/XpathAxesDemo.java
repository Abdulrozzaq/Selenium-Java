package day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.facebook.com/login/?_rdc=1&_rdr");
		driver.manage().window().maximize();
		
		//String text = driver.findElement(By.xpath("//a[normalize-space()='Primo Chemicals']/parent::td")).getText();
		//System.out.println(text);
		
		//String text = driver.findElement(By.xpath("//a[normalize-space()='Create new account']/parent::*/parent::div/parent::*/div[1]")).sendkeys("Baki");

		
		
		
		
		//div[@id='loginform']/child::div[4]/div[3]/a

		//a[normalize-space()='Create new account']/parent::*/parent::div/parent::*/div[1]
		
		driver.close();
	}
}