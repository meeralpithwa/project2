package project2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.SendKeysAction;

public class FlightDemo {
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		WebElement flight = driver.findElement(By.xpath("//a[@href='#flights']"));
		flight.click();
		
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//div[@id='flights']//div[@id=\"s2id_location_from\"]/a"));
		from.click();
		from.sendKeys("delhi");
		
		Thread.sleep(3000);
		
		WebElement hotels=driver.findElement(By.xpath("//a[@href='#hotels']"));
		
		Actions clickonflight = new Actions(driver);
		clickonflight.moveToElement(hotels, 19, 136).build().perform();
		Thread.sleep(3000);
		clickonflight.click().build().perform();
		
		Thread.sleep(3000);
		
		WebElement to =driver.findElement(By.xpath("//div[@id='flights']//div[@id=\"s2id_location_to\"]/a"));
		to.click();
		to.sendKeys("mum");
		
		
		
		Actions clickonto = new Actions(driver);
		clickonto.moveToElement(flight,0, 130).build().perform();
		Thread.sleep(6000);
		clickonto.click().build().perform();
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@placeholder='Depart']"));
		//date.click();
		date.sendKeys("2019-02-15");
		
		
		WebElement passenger = driver.findElement(By.xpath("//input[@name='totalManualPassenger']"));
		
		
		/*Thread.sleep(2000);*/
		
		passenger.clear();
		passenger.sendKeys("4");
		
		
		WebElement submit = driver.findElement(By.xpath("//div[@id='flights']//button[@type='submit']"));
		submit.click();
		
		driver.navigate().back();
		
		WebElement flighttwo = driver.findElement(By.xpath("//a[@href=\"#flights\"]"));	
		flighttwo.click();
		
		Thread.sleep(2000);
		
		WebElement flyFrom1 = driver.findElement(By.xpath("//div[@id = 'flights']//div[@id='s2id_location_from']/a/span[text()='Enter City Or Airport']"));
		flyFrom1.click();
		Thread.sleep(3000);
		

		WebElement genericTextBox1 = driver.findElement(By.xpath("//div[@id='select2-drop']//input"));
		genericTextBox1.sendKeys("Bom");
		
		Thread.sleep(3000);
		
		WebElement dropdown11 = driver.findElement(By.xpath("//div[@id='select2-drop']//ul//li//div"));
		dropdown11.click();
		
		Thread.sleep(3000);
		
		WebElement flyTo1 =driver.findElement(By.xpath("//div[@id = 'flights']//div[@id='s2id_location_to']/a/span[text()='Enter City Or Airport']"));
		flyTo1.click();
		
		
		WebElement genericTextbox1 = driver.findElement(By.xpath("//div[@id='select2-drop']//input"));
		genericTextbox1.sendKeys("Del");
		
		Thread.sleep(3000);
		
		WebElement dropdown111 = driver.findElement(By.xpath("//div[@id='select2-drop']//ul//li//div"));
		dropdown111.click();
		
		Thread.sleep(3000);
		
		WebElement flyDate1 = driver.findElement(By.name("departure"));
		flyDate1.sendKeys("2019-02-22");
		
		Thread.sleep(3000);
		
		
		WebElement noOfPassengers1 = driver.findElement(By.name("totalManualPassenger"));
		noOfPassengers1.clear();
		Thread.sleep(1000);
		
		noOfPassengers1.sendKeys("2");
		
		Thread.sleep(3000);
		
		
		WebElement search1 = driver.findElement(By.xpath("//div[@id='flights']//button[@type='submit']"));
		search1.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.close();
		
		
		
	}

}
