package Locator;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandle {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.canarabank.in");
			
			String parentWindowHandle=driver.getWindowHandle();
			
		//	driver.findElement(By.cssSelector("body > div:nth-child(6) > div > div.col-md-9.pl0.pr0.rightpanel-home > div.top-header > div > form:nth-child(2) > button")).click();

			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/ul/li[2]/a/strong/img")).click();
	//	driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		Set<String> allWindows=driver.getWindowHandles();
			
			Iterator itr=allWindows.iterator();
			for(String child:allWindows) {
				if(!parentWindowHandle.equals(child)) {
					
					driver.switchTo().window("child");
				
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("ramesh");
			driver.findElement(By.xpath("//input[@id='pass'][1]")).sendKeys("rameshuet");
			driver.findElement(By.xpath("//input[@id='u_0_3']")).click();
			driver.close();
			
		}
			}
		}

	}


