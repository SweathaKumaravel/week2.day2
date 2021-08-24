package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Bangalore");
		Thread.sleep(10000);
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Managalore");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@class='we day']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		System.out.println("Pass");
		
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the buses " + text);
		  
		WebElement sleeper = driver.findElementByXPath("//input[@id='bt_SLEEPER']/following-sibling::label");	
		driver.executeScript("arguments[0].scrollIntoView();", sleeper);
		sleeper.click();
		String sleeperSrc = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the Sleeper buses" + sleeperSrc);
		Thread.sleep(20000);
		
		
		sleeper.click();
		System.out.println("Sleeper De-selected");
		Thread.sleep(50000);
		
		WebElement ac = driver.findElementByXPath("//input[@id='bt_AC']/following-sibling::label[1]");
		Thread.sleep(10000);
		ac.click();
		System.out.println("The AC clicked");
		
		Thread.sleep(20000);
		String acSrc = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the AC buses" + acSrc);
		
		Thread.sleep(20000);
		WebElement nonAc = driver.findElementByXPath("(//input[@id='bt_NONAC']/following-sibling::label)[1]");
		nonAc.click();
		
		String overAll = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the Non Ac + AC buses" + overAll);
		System.out.println("Done");
	}

}
