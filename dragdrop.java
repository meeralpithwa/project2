package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath("//a[@href=\"/drag_and_drop\"]"));
		drag.click();
		
		WebElement a=driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
		a.click();
		WebElement b=driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
		b.click();
		
		
		Actions act =new Actions(driver);
		act.dragAndDrop(a,b).build().perform();
		
		driver.close();

	}

}
