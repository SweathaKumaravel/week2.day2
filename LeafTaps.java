package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sweatha");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		String expectedTitle = "View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Expected Title is same as actual Title");
		}
		else
		{
			System.out.println("Title of resulting page is not matching");
		}
		driver.findElement(By.linkText("Edit")).click();	
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Leaftaps");
		driver.findElement(By.name("submitButton")).click();	
		
		String companyNameConfirm = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The change is confirmed: " +companyNameConfirm);
		
		driver.close();
	}

}
