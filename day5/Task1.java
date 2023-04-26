package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		builder.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).perform();
	}

}
