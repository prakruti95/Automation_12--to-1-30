import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_Practice_Form 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Workspaces\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("sahdev");
		driver.findElement(By.id("lastName")).sendKeys("Xyz");
		WebElement element = driver.findElement(By.id("userEmail"));
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
}
