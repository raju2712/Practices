package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FooterLink {

	@Test
	public void footerLink() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
	 	driver.findElement(By.xpath("//div[@id='PageList1']//li//a[contains(.,'Home')]")).click();
	 	driver.findElement(By.xpath("//div[@id=\"PageList1\"]//li//a[contains(.,'Hidden Elements & AJAX')]")).click();
	 	driver.findElement(By.xpath("//div[@id=\"PageList1\"]//li//a[contains(.,'Download Files')]")).click();
	 	
	}
}
