package TestAutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void uploadFile() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\FloweR KinG\\Downloads\\IMG-20250524-WA0047.jpg");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
	// upload multiple files
		
		driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\FloweR KinG\\Downloads\\IMG_20250524_181813.jpg");
		driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\FloweR KinG\\Downloads\\IMG-20250524-WA0047.jpg");
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	}

}
