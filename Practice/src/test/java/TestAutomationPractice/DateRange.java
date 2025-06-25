package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateRange {

	@Test
	public void rangeOfDate() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("start-date")).sendKeys("27-01-2025");
		driver.findElement(By.id("end-date")).sendKeys("27-01-2026");
		driver.findElement(By.className("submit-btn")).click();
	}

}
