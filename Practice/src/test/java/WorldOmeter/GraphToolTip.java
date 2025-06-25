package WorldOmeter;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GraphToolTip {

	@Test
	public void graphToolTip() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.worldometers.info/world-population/");
		
		WebElement growth = driver.findElement(By.xpath("//h2[text()='Growth Rate']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", growth);
		
		List<WebElement> lines = driver.findElements(By.xpath("//*[name()='g' and contains(@clip-path,'url(https://www.worldometers.info/world-population/#_ABSTRACT_RENDERER_ID_6)')]/*/*"));
		 
		Actions a = new Actions(driver);
		 
		for (WebElement li : lines) {
			a.moveToElement(li).perform();
			try {
				WebElement toolTip = driver.findElement(By.xpath("//*[name()='g' and @class='google-visualization-tooltip']"));
				System.out.println(toolTip.getText());
			} catch (Exception e) {

			}
		}
		 
		 
		 
		 
		 
		 
	}
}
