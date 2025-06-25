package TestAutomationPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink {
	
	@Test
	public void brokenLink() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		for (WebElement Blink : Link) {
			String href = Blink.getDomAttribute("href");
			try {
				URL url = new URL(href);
				HttpURLConnection URLconn = (HttpURLConnection)url.openConnection();
				int statusCode = URLconn.getResponseCode();
				if(statusCode >= 400) {
					System.out.println(href+" => " + statusCode);
				}
			} catch (Exception e) {

			}
			
		}
		driver.close();
	}

}
