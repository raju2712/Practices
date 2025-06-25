package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SVG {
	
	@Test
	public void svg() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		Actions a = new Actions(driver);
		
		WebElement rect = driver.findElement(By.xpath("//div[@class='svg-container']/descendant::*[name()='rect']"));
		WebElement redCircle = driver.findElement(By.xpath("//div[@class='svg-container']/descendant::*[@fill='red']"));
		WebElement blurTriangle = driver.findElement(By.xpath("//div[@class='svg-container']/descendant::*[@fill='blue']"));
		WebElement visitorGraph = driver.findElement(By.xpath("//*[name()='g']/descendant::*[@fill='none']"));
		
		a.scrollToElement(rect).perform();
		a.moveToElement(rect).perform();
		Thread.sleep(1000);
		a.moveToElement(redCircle).perform();
		Thread.sleep(1000);
		a.moveToElement(blurTriangle).perform();
		Thread.sleep(1000);
		a.scrollToElement(visitorGraph).perform();
		a.moveToElement(visitorGraph).perform();
		
		driver.close();
		
		}

}
