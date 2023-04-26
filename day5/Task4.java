package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("source")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.id("source")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("destination")).sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement datepicker = driver.findElement(By.id("datepicker1"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','28-04-2023')",datepicker);
		Thread.sleep(3000);
		driver.findElement(By.id("seo_search_btn")).click();
		
				
	}

}
