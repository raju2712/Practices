package TestAutomationPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ColorScrolling {

	@Test
	public void Color() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//option[@value='white']")).click();
		
		//printing all colors
		List<WebElement> colors = driver.findElements(By.xpath("//select[@id='colors']/option"));
//		for (WebElement color : colors) {
//			System.out.println(color.getText());
//		}
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("White");
		
		for (WebElement color1 : colors) {
			String singleColor = color1.getText();
			if(color.contains(singleColor)) {
				System.out.println(singleColor+" is present");
			}else {
				System.out.println(singleColor+" in not present");
			}

		}
		
		
		
		
		System.out.println("----------------------");
		
	//Sorted list
		
		driver.findElement(By.xpath("//option[contains(.,'Rabbit')]")).click();
		//printing all animals
		 List<WebElement> animals = driver.findElements(By.xpath("//select[@id='animals']/option"));
		 for (WebElement animal : animals) {
			System.out.println(animal.getText());
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
