package P1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
	}

}
