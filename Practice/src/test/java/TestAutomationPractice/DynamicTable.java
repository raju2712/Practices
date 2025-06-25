package TestAutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTable {

	@Test
	public void dynamicTable() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
	   
	   //Network speed of specific broeser
	   String Name = driver.findElement(By.xpath("//td[contains(.,'Chrome')]")).getText();
	   String Speed = driver.findElement(By.xpath("//td[contains(.,'Chrome')]/following-sibling::td[contains(.,'Mbps')]")).getText();
	   System.out.println(Name+" "+Speed);
	   
	   System.out.println("----------------------------");
	   
	   //print all browser and it's memory
	   
	 List<WebElement> col = driver.findElements(By.xpath("//table[@id='taskTable']//tr/child::td[position()=1 or position()=2]"));
	 for(int i=0; i<col.size(); i=i+2) {
		 WebElement ele2 = col.get(i);
		 WebElement ele3 = col.get(i+1);
		 String Bname = ele2.getText();
		 String Memory = ele3.getText();
		 System.out.printf("%-25s %-15s%n",Bname,Memory);
	 }
	}
}
//td[contains(.,'Chrome')]/following-sibling::td[contains(.,'MB')]