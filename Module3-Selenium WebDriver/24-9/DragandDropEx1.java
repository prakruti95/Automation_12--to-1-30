import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropEx1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = DriverConnection.getconnect("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));//img
		WebElement to = driver.findElement(By.id("trash"));//container
		
		Actions builder = new Actions(driver);
		
		//builder.dragAndDrop(from, to).build().perform();
		
		Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
		
		dd.perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
