package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicButton {
	
	@Test
	public void dynamicButton() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	 
	 	WebElement btn = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
	 	System.out.println(btn.getText());
	 	btn.click();
	 	
	 	System.out.println(btn.getText());
	 	Thread.sleep(2000);
	 	btn.click();
	}

}
