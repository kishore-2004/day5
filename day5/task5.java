package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Apple");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		

	}

}
