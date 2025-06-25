package TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePicker2 {

	@Test
	public void datePicker2() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("txtDate")).click();
		WebElement monthDD = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s1 = new Select(monthDD);
		// printing dates
		List<WebElement> months = s1.getOptions();
		for (WebElement month : months) {
			System.out.println(month.getText());
		}
		System.out.println("------------------------------");

		s1.selectByContainsVisibleText("Jan");

		WebElement yearDD = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s2 = new Select(yearDD);
		// printing month
		List<WebElement> dates = s2.getOptions();
		for (WebElement date : dates) {
			System.out.println(date.getText());
		}
		System.out.println("------------------------------");

		s2.selectByValue("2026");
		driver.findElement(By.xpath("//a[@data-date='27']")).click();
	}
}
