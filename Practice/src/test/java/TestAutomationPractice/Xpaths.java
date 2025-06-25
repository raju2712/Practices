package TestAutomationPractice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpaths {

	@Test
	public void Int() throws InterruptedException {
		
		int page = 2;
		String NAME = "Raju";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//XPATHs
		
		//td[text()='Soundbar']/ancestor::tr/child::td/input   ------------------- CheckBox
		//td[text()='Soundbar']/ancestor::tr/child::td[contains(text(),'99')]   ----------------------  Price
		//td[text()='Soundbar']/preceding-sibling::td   ----------------------  ID
		//*[name()='svg' and @width='30'] ------------- SVG
		//div[@class='svg-container']/descendant::*[name()='rect'] ------------- specific SVG
		//div[@class="form-group"]/descendant::div//input[@type='checkbox']  ----------------  Days Checkbpx
		
		
		
		
		
		
		
		
		}
	}
