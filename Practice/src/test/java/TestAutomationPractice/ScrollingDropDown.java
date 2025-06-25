package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollingDropDown {
	
	@Test
	public void scrollingDropDown() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions a = new Actions(driver);

		driver.findElement(By.id("comboBox")).click();
		//driver.findElement(By.id("comboBox")).click();
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Item 1']"))).perform();
		a.scrollToElement(driver.findElement(By.xpath("//div[text()='Item 27']"))).perform();
		Thread.sleep(2000);
		a.scrollToElement(driver.findElement(By.xpath("//div[text()='Item 100']"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Item 98']"))).click().perform();
	
	}

}
