package Others;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_ReturnDataBackToExcel {

	/**
	 * Capture all the product name and price and store in Excel sheet
	 * @throws Throwable
	 */
	
	@Test
	public void Flipkart() throws Throwable {
		
		String BRAND = "Cars toys";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.in/");
		driver.findElement(By.name("q")).sendKeys(BRAND , Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(3000);

		//For Vertical Aligned products
//		List<WebElement> Pname = driver.findElements(By.xpath("//div[@class='yKfJKb row']/descendant::div[@class='KzDlHZ']"));
//		List<WebElement> Pprice = driver.findElements(By.xpath("//div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		
		//For Horizontal Aligned products
		List<WebElement> Pname = driver.findElements(By.xpath("//div[@class='slAVV4']/descendant::a[@class='wjcEIp']"));
		List<WebElement> Pprice = driver.findElements(By.xpath("//div[@class='slAVV4']/descendant::div[@class='Nx9bqj']"));

		for (int i = 0; i <= Pname.size()-1; i++) {

			String Name = Pname.get(i).getText();
			String Price = Pprice.get(i).getText();
			
//			System.out.println(Name);
//		    System.out.println(Price);

			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet("Data").createRow(i).createCell(0, CellType.STRING).setCellValue(Name);
			wb.getSheet("Data").getRow(i).createCell(1, CellType.STRING).setCellValue(Price);
			FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
			wb.write(fos);
			wb.close();			
		}
		driver.quit();
	}
}
