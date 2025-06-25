package TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTable {
	
	@Test
	public void stsicTable() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");

	  //Author of Specic Book
	  String AuthorOfBook = driver.findElement(By.xpath("//td[text()='Master In Selenium']/following-sibling::td[1]")).getText();
	  System.out.println(AuthorOfBook);
	  
	  //Detains of specific book
	  
	   List<WebElement> detailsOfBook = driver.findElements(By.xpath("//td[text()='Master In Selenium']/following-sibling::td"));
	   for (WebElement detail : detailsOfBook) {
		System.out.println(detail.getText());
	   }
	   
	   System.out.println("------------------------------");
	   
	  //Books written by Specific author
	   
	   List<WebElement> books = driver.findElements(By.xpath("//td[text()='Mukesh']/preceding-sibling::td"));
	   for (WebElement bookNames : books) {
		System.out.println(bookNames.getText());
	   }
	   
	   System.out.println("------------------------------");
	   
	   //Price of specific Subject book
	   List<WebElement> price = driver.findElements(By.xpath("//td[text()='Selenium']/following-sibling::td"));
	   for (WebElement prices : price) {
		System.out.println(prices.getText());
	}
	}

}
