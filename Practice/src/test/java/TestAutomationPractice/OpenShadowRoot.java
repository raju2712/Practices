package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenShadowRoot {

	@Test
	public void openshadow() {

		String NAME = "Raju";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		SearchContext host = driver.findElement(By.id("shadow_host")).getShadowRoot();
		host.findElement(By.cssSelector("input[type='text']")).sendKeys(NAME);
		host.findElement(By.cssSelector("input[type='checkbox']")).click();
		host.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\FloweR KinG\\Downloads\\IMG-20250524-WA0047.jpg");

	}

}
