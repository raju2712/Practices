package Ahi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenarios {

	@Test(priority = 1)
	public void cricBuzz() {
		
		String p1 = "Shubman Gill";
		String p2 = "Babar Azam";
		String p3 = "Rohit Sharma";
		String p4 = "Heinrich Klaasen";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.cricbuzz.com/");
		WebElement ranking = driver.findElement(By.linkText("Rankings"));
		Actions a = new Actions(driver);
		a.moveToElement(ranking).perform();
		WebElement men = driver.findElement(By.linkText("ICC Rankings - Men"));
		a.moveToElement(men).click().perform();
		
		driver.findElement(By.linkText("ODI")).click();
		
		String rating = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/child::div/descendant::div[@class='cb-col cb-col-67 cb-rank-plyr' and contains(.,'"+p1+"')]/parent::div/following-sibling::div")).getText();
		String country = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/child::div/descendant::div[@class=\"cb-col cb-col-67 cb-rank-plyr\" and contains(.,'"+p1+"')]/child::div")).getText();
		System.out.println(p1 +" rating is " +rating+" he is from "+country);
		
		System.out.println("----Task 1 Completed----");
		
		driver.close();
		
	}
	
	@Test(priority = 2)
	public void olympics() throws InterruptedException {
		
		String p1 = "Arlen LOPEZ";
		String p2 = "Imam KHATAEV";
		String p3 = "Paulo AOKUSO";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		
		driver.findElement(By.xpath("//div[@class='sc-6ba3678f-3 kylzhR']/child::a[text()='Results']")).click();
	
		JavascriptExecutor js = (JavascriptExecutor	)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[name()='p' and contains(.,'Boxing')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Event']")).click();
		driver.findElement(By.xpath("//section[@class='Grid-styles__GridContainer-sc-dfdac50-0 hzKkrd']/descendant::p[contains(.,'(75-81kg)')]")).click();
		
		driver.findElement(By.xpath("//a[@data-cy='go-link']")).click();
		
		String pName = driver.findElement(By.xpath("//div[@data-cy='table-content']/descendant::h3[text()='"+p1+"']")).getText();
		String pCountry = driver.findElement(By.xpath("//div[@data-cy='table-content']/descendant::h3[text()='"+p1+"']/preceding::div[@data-cy='flag-with-label']/child::span")).getText();
		System.out.println(pName +" from "+pCountry);
		
		System.out.println("----Task 2 Completed----");
		
		driver.close();
	}
	
	@Test(priority = 3)
	public void worldOmeter() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://www.worldometers.info/world-population/");
		
		WebElement tableTop = driver.findElement(By.xpath("//div[@class='datatable-wrapper datatable-loading no-footer sortable searchable fixed-columns']/child::div/descendant::th[@aria-sort='ascending']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tableTop);
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[text()='Holy See']"));
				String rowText = driver.findElement(By.xpath("//a[text()='Holy See']/ancestor::tr")).getText();
				System.out.println(rowText);
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//button[text()='›']")).click();
			}
		}
		
		System.out.println("----Task 3 Completed----");

		driver.close();
	}
	
	@Test(priority = 4)
	public void cricBuzz2() {
		
		String p1 = "Maheesh Theekshana";
		String p2 = "Rashid Khan";
		String p3 = "Ravindra Jadeja";
		String p4 = "Adil Rashid";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.linkText("Rankings")).click();
		driver.findElement(By.xpath("//a[text()='Bowling']")).click();
		driver.findElement(By.linkText("ODI")).click();
		
		String rating = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/child::div/descendant::div[@class='cb-col cb-col-67 cb-rank-plyr' and contains(.,'"+p1+"')]/parent::div/following-sibling::div")).getText();
		String country = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/child::div/descendant::div[@class=\"cb-col cb-col-67 cb-rank-plyr\" and contains(.,'"+p1+"')]/child::div")).getText();
		System.out.println(p1 +" rating is " +rating+" he is from "+country);
		
		System.out.println("----Task 4 Completed----");
		
		driver.close();	
	}
	
	@Test(priority = 5)
	public void worldOmeter2() {
		
		String country1 = "India";
		String country2 = "Belgium";
		String country3 = "Oman";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://www.worldometers.info/geography/countries-of-the-world/");
		driver.findElement(By.xpath("//p[text()='More']")).click();
		List<WebElement> dd = driver.findElements(By.xpath("//li[@class='*:block *:px-4 *:py-1 *:hover:bg-zinc-100']"));
		for (WebElement option : dd) {
			System.out.println(option.getText());
		}
		driver.findElement(By.xpath("//ul[@aria-labelledby='header-nav-more-trigger']/child::li/a[text()='Food & Agriculture']")).click();
		WebElement countries = driver.findElement(By.xpath("//a[text()='"+country1+"']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		countries.click();
		
		WebElement graph = driver.findElement(By.xpath("//*[name()='text' and text()='Number of Undernourished in India']"));
		js.executeScript("arguments[0].scrollIntoView(true)", graph);
		
        List<WebElement> points = driver.findElements(By.xpath("//*[name()='g' and contains(@class,'highcharts-markers highcharts-series-0 highcharts-spline-series highcharts-tracker')]/*[@fill='#FF3300']"));		
	    Actions a = new Actions(driver);
	    for (WebElement singlePoint : points) {
			a.moveToElement(singlePoint).perform();
			try {
				//WebElement toolTip = driver.findElement(By.xpath("(//*[name()='svg' and contains(@aria-label,'Number of Undernourished in India')]/*[@style='cursor: default; pointer-events: none;']/*)[2]"));
				WebElement toolTip = driver.findElement(By.xpath("//*[name()='text' and @style='font-size: 0.8em; fill: rgb(51, 51, 51);']"));
				System.out.println(toolTip.getText());
			} catch (Exception e) {
				
			}
		}
	    System.out.println("----Task 5 Completed----");
	    driver.close();
	}
	
	@Test(priority = 7)
	public void bbciTv() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://www.bcci.tv/international/men/rankings/test");
		String country = driver.findElement(By.xpath("//table[@class='table']/descendant::h6[text()='Pakistan']")).getText();
		String rating = driver.findElement(By.xpath("//table[@class='table']/descendant::h6[text()='India']/parent::td/following-sibling::td[contains(.,'Rating')]/p")).getText();
		System.out.println(country+" rating is "+ rating+ " in test");
		
		driver.findElement(By.xpath("//button[text()='T20I']")).click();
		
		String t20Country = driver.findElement(By.xpath("//table[@class='table']/descendant::h6[text()='West Indies']")).getText();
		String t20Rating = driver.findElement(By.xpath("//table[@class='table']/descendant::h6[text()='West Indies']/parent::td/following-sibling::td[contains(.,'Rating')]/p")).getText();
		System.out.println(t20Country+" rating is "+ t20Rating+" in T20I");
		
		 System.out.println("----Task 6 Completed----");
		    driver.close();
		
	}
	
	@Test(priority = 8)
	public void olympics2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//div[@class='sc-6ba3678f-3 kylzhR']/child::a[text()='Results']")).click();
		
		
		
		
		
	}
	
	@Test(priority = 6)
	public void bcc() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://www.bbc.com/sport/olympics/paris-2024/medals");
		driver.findElement(By.xpath("//span[text()='Medal results']")).click();
		WebElement sports = driver.findElement(By.id("discipline-selector"));
		Select s = new Select(sports);
		s.selectByValue("Shooting");
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.xpath("//tbody/descendant::div[@class='ssrcss-7dafha-DesktopNames e1dg50ic3']/child::div[@class='ssrcss-1xzbuw5-SecondaryName e1dg50ic0']"));
		for (WebElement cName : countries) {
			System.out.println(cName.getText());
		}
		
		
		
	
	}
	
	
	
	
	
	
	
}
