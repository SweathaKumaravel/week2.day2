package week2.day2assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
        WebElement findElement = driver.findElement(By.xpath("(//div[@class='example']//input)[3]"));
        if(findElement.isSelected())
        {
        	System.out.println("The checkbox is selected");
        }
        WebElement findElement2 = driver.findElement(By.xpath("((//div[@class='example'])[3]//input)[2]"));
        if(findElement2.isSelected())
        {
        	findElement2.click();
        }
        for (int i = 1; i <=5; i++) {
        	WebElement findElement3 = driver.findElement(By.xpath("((//div[@class='example'])[4]//input)["+i+"]"));
        	findElement3.click();
	}

}
}