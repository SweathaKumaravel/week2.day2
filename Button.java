package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
		System.out.println("Location "+driver.findElement(By.id("position")).getLocation());
		System.out.println("Color " +driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size " + driver.findElement(By.id("size")).getSize());
		
	}

}
