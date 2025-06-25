package Lambda_Expression;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoA {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		String Name = driver.findElement(By.xpath("//td[contains(.,'Chrome')]")).getText();
//		
//		String Speed = driver.findElement(By.xpath("//td[contains(.,'Chrome')]/following-sibling::td[contains(.,'Mbps')]")).getText();
//		
//		System.out.println(Name+" "+Speed);
//		WebElement ss = driver.findElement(RelativeLocator.with(By.xpath("//table[@id='taskTable']//tr/child::td[1]/following-sibling::td[contains(.,'MB')]")).below(By.xpath("//th[text()='Memory (MB)']")));
//		System.out.println(ss.getText());
		
//		List<WebElement> ss = driver.findElements(
//				RelativeLocator.with(By.xpath("//td[contains(.,'MB')]")).below(By.xpath("//th[contains(.,'Memory')]")));
//		for (WebElement webElement : ss) {
//			System.out.println(webElement.getText());
//		}
			Actions a = new Actions(driver);
			
			SearchContext host = driver.findElement(By.id("shadow_host")).getShadowRoot();
			host.findElement(By.cssSelector("input[type='text']")).sendKeys("Raju");
			SearchContext nestedSh = host.findElement(By.cssSelector("div[id='nested_shadow_host']")).getShadowRoot();
			nestedSh.findElement(By.cssSelector("input[type='checkbox']")).click();
		
	}

}
