package TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public void dropDown() {
		
		String ExpCountry = "India";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement dd = driver.findElement(By.id("country"));
		Select s = new Select(dd);
		
	//print all options
		
		//System.out.println(dd.getText());
		List<WebElement> list = s.getOptions();
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		//Selecting country
		s.selectByVisibleText(ExpCountry);
		
		//Validating the selected option only selected
		Assert.assertEquals(s.getFirstSelectedOption().getText(), ExpCountry);
		
	   
		
		
		
	}
}
