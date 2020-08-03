package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropup {
@Test
	public static void main(String[] args, WebElement day, WebElement month, WebElement year) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdNGV-EtVNyVfMEe50NBEJ1dZ__jzpYJ-7Xy_tEAUdhEGTzD8H6BDAmS9njIl2MUZzHoKXQWaLyYmVaGlUPTo7PnAZ-DhqMvHLMLT5T79wwMg&smuh=11057&lh=Ac_vEPf8U3XousCH");
		driver.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(day);
		select.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//select[@id='month']"));
		 select=new Select(month);
		 select.selectByValue("4");
		 
		 driver.findElement(By.xpath("//select[@id='year']"));
		 select=new Select(year);
		 select.selectByVisibleText("1989");
	}



	}


