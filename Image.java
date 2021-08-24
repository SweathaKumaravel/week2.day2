package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//label[text()='Click on this image to go home page']/following-sibling::img")
				.click();
		driver.navigate().back();
		WebElement broken = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		if (broken.getAttribute("onclick") == null) {
			System.out.println("Image is broken");
		} else
			System.out.println("Image is available");
		WebElement key = driver
				.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));

		Actions mouseMove = new Actions(driver);
		mouseMove.moveToElement(key).click().build().perform();
	}

}
