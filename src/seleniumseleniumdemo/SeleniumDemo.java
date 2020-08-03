package seleniumseleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		driver.get("htttp//www.google.com");
		//driver.get("http:www.javatpoint.com");
		

	}
 
}
