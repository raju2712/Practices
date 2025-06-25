package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationTable {
	
	@Test
	public void paginationTable() {
		
		int page = 2;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		//finding specific product and click chectbox of that
		for(;;) {
			try {
				String data = driver.findElement(By.xpath("//table[@id='productTable']//td[text()='Soundbar']/ancestor::tr")).getText();
				driver.findElement(By.xpath("//td[text()='Soundbar']/ancestor::tr//input")).click();
				System.out.println(data);
				break;
			    } 
			catch (Exception e) {
				driver.findElement(By.xpath("//a[text()='"+page+"']")).click();
				page++;
				}
			}
		driver.close();
	}

}
