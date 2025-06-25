package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {

	@Test
	public void mouseAction() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointMe = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions a = new Actions(driver);
		a.moveToElement(pointMe).perform();
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.moveToElement(mobile).click().perform();
		
		//Double click
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		a.doubleClick(doubleClick).perform();
		
	    //Drag and Drop
		
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.moveToElement(trg);
		a.dragAndDrop(src, trg).perform();
		
		//Slider
		
		WebElement Slider1st = driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
		WebElement Slider2nd = driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
		a.clickAndHold(Slider1st).moveByOffset(50, 0).release(Slider1st).perform();
		a.clickAndHold(Slider2nd).moveByOffset(20, 0).release(Slider2nd).perform();
	}
}
