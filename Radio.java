package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.id("yes"));
		findElement.click();
		System.out.println(findElement.getText());

		for (int i = 1; i <= 2; i++) {
			WebElement element = driver.findElement(By.xpath("(//input[@name='news'])[" + i + "]"));
			if (element.isSelected()) {
				System.out.println("the default element is " + element.getText());
			}
			WebElement findElement2 = driver.findElement(By.xpath("(//input[@name='age'])[3]"));
			if (!findElement2.isSelected()) {
				findElement2.click();
	}

}
	}
}
