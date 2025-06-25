package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker1 {

	@Test
	public void datePicker1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		// selecting a specific date from specific month
		driver.findElement(By.id("datepicker")).click();
		for (;;) {
			try {
				String JAN = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				driver.findElement(By.xpath("//a[@data-date='27']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
		}
	}

}
