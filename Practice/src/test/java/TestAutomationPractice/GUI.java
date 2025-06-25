package TestAutomationPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GUI {

	@Test
	public void TextFields() {
		
		String actMale = "Male";
		String actFemale = "Female";
		String actThurs = "Thursday";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("name")).sendKeys("Raju");
		driver.findElement(By.id("email")).sendKeys("raju123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("963258741");
		driver.findElement(By.id("textarea")).sendKeys("Banglore");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("thursday")).click();
		
		//Verifing the Presence of Male Text
		String expMale = driver.findElement(By.xpath("//label[@for='male']")).getText();
		Assert.assertEquals(actMale, expMale);
		//Verifing the Presence of Female Text
		String expFemale = driver.findElement(By.xpath("//label[@for='female']")).getText();
		Assert.assertEquals(actFemale, expFemale);
		//Verifing the Presence of Thursday Text
		String expThurs = driver.findElement(By.xpath("//label[@for='thursday']")).getText();
		Assert.assertEquals(actThurs, expThurs);
		
		//to print all days
		List<WebElement> days = driver.findElements(By.xpath("//label[contains(.,'Day')]/ancestor::div[@class='form-group']/descendant::label[@class='form-check-label']"));
		for (WebElement day : days) {
			System.out.println(day.getText());
		}
		//Verifing the presence of Days
		List<String> expDays = new ArrayList<>();  
		expDays.add("Sunday");
		expDays.add("Monday");
		expDays.add("Tuesday");
		expDays.add("Wednesday");
		expDays.add("Thursday");
		expDays.add("Friday");
		expDays.add("Saturday");
		
		for (WebElement webElement : days) {
			String text = webElement.getText();
			if (expDays.contains(text)) {
				System.out.println(text + " is Present");
			} else {
				Assert.fail("Days not present");
			}
		}
		

		
		
	}
}
