package QSPdemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElements {
	
	@Test
	public void webElements() {
		
		String NAME ="Raju";
		String EMAIL ="raju123@gmail.com";
		String PASSWORD ="ABCDEF@12345";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//TextField
		
		driver.findElement(By.name("name")).sendKeys(NAME);
		driver.findElement(By.name("email")).sendKeys(EMAIL);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Disabled Elements
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		boolean enableOrDisable = driver.findElement(By.name("email")).isEnabled();
		System.out.println(enableOrDisable);
		
		WebElement EmailTF = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].removeAttribute", EmailTF);
		EmailTF.sendKeys("ABCD@5679");
//		driver.findElement(By.name("email"));
//		driver.findElement(By.name("password"));
		
		
		
	}

}
