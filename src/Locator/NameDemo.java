package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameDemo {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("guru99");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > table > tbody > tr.mslg.dmenKe > td:nth-child(1) > div > span > h3 > a")).click();
		
		driver.findElement(By.cssSelector("#menu-5760-particle > nav > ul > li.g-menu-item.g-menu-item-101.g-menu-item-type-component.g-standard > a > span > span")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		
		
		driver.findElement(By.cssSelector("#g-footer > div > div:nth-child(1) > div > div > div > div > div > div:nth-child(3) > div:nth-child(2) > div > div > div > a > i")).click();
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,9000)");
		
	driver.close();
		
		
		
	}

}
