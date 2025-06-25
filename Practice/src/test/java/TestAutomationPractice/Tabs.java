package TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tabs {
	
	@Test
	public void tabs() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
	 	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Cars");
	 	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).click();
	 	
	 	//click on 2nd link
	 	
	 	driver.findElement(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//div[2]")).click();
	 	
	 	//capture all results
	 	
	 	List<WebElement> results = driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//div"));
	 	for (WebElement result : results) {
			System.out.println(result.getText());
		}
	}

}
