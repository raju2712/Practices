package TestAutomationPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KBlogIn {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.get("https://www.kreditbee.in/signin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='loanCardDetails']")).click();

		driver.switchTo().frame(driver.findElement(By.id("iframe-container")));

		driver.findElement(By.name("mobile")).sendKeys("7871684605");
		Thread.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Continue')]/ancestor::button"));
		ele1.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("OTP");
		//Continue will get click automatcally
		
		driver.switchTo().frame(driver.findElement(By.id("iframe-container")));
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='sc-hSdWYo cOyjXk']"));
		ele2.sendKeys(Keys.ENTER);
		
		
		
	}

}
