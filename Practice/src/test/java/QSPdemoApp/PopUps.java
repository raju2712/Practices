package QSPdemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PopUps {

	@Test
	public void CofirmpopUp() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
				
		driver.findElement(By.xpath("//td[text()='APPLEIPhone']/preceding-sibling::td//input")).click();
		driver.findElement(By.id("deleteButton")).click();
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void PromptPopUp() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.xpath("//td[text()='APPLEIPhone']/preceding-sibling::td//input")).click();
		driver.findElement(By.id("deleteButton")).click();
		driver.switchTo().alert().sendKeys("Raju");
		driver.switchTo().alert().accept();
	}
		
	@Test
	public void AuthPopUp(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		//Notification popup
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver1 = new ChromeDriver(option);
		driver1.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver1.findElement(By.id("browNotButton")).click();
	}
	
	@Test
	public void HideenDivision() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	}

