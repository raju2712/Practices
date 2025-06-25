package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PopUps {
	
	@Test
	public void popUp() {
		
		String NAME = "Raju";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");

	 	//Alert popup
		
	 	driver.findElement(By.id("alertBtn")).click();
	 	driver.switchTo().alert().accept();
	 	
	 	//Confirmation Popup
	 	
	 	driver.findElement(By.id("confirmBtn")).click();
	 	driver.switchTo().alert().dismiss();
	 	
	 	//Promt Popup
	 	
	 	driver.findElement(By.id("promptBtn")).click();
	 	driver.switchTo().alert().sendKeys(NAME);
	 	driver.switchTo().alert().accept();
	 	
	 	//Verifing name
	 	String actName = driver.findElement(By.id("demo")).getText();
		boolean status = actName.contains(NAME);
		Assert.assertEquals(status, true);
	}

}
