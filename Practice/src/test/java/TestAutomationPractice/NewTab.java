package TestAutomationPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTab {
	
	@Test
	public void newTab() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	
		String Pid = driver.getWindowHandle();
//		driver.findElement(By.xpath("//button[contains(.,'New Tab')]")).click();
//		Set<String> Ids = driver.getWindowHandles();
//		for (String id : Ids) {
//			driver.switchTo().window(id);
//			String actTitle = driver.getTitle();
//			if(actTitle.contains("SDET-QA Blog")) {
//				break;
//			}
//		}
//		driver.findElement(By.name("q")).sendKeys("SDLC");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		driver.close();
		
	    //Closing child window and switching control to parent
		
		driver.findElement(By.id("PopUp")).click();
		Set<String> childPopUp = driver.getWindowHandles();
		for (String id : childPopUp) {
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();
			if(actTitle.contains("Selenium")) {
				break;
			}
		}
		driver.close();
		
        //2nd Child Popup
		
		for (String id : childPopUp) {
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();
			if(actTitle.contains("Fast and reliable end-to-end")) {
				break;
			}
		}
	}

}
