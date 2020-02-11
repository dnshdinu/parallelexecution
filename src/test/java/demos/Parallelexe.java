package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallelexe {
  static WebDriver driver;
    @Parameters({"browser"})
	@Test
  public void test(String name) {
	if(name.equals("ie")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\par\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if(name.equals("ff")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\par\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	else {
		System.out.println("invalid");
	}
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("dinutalk@gmail.com");	
	
  }
	
}
