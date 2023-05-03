package day6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeOptions;

public class ce3 {
	WebDriver d;
	  @Test
	  public void execution() throws InterruptedException {
		  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(4000);
		  String title = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  Assert.assertEquals("Dashboard", title);
	  }
	  
	  @BeforeMethod
	  public  void beforeMethod() throws InterruptedException {
		  ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			d=new ChromeDriver();
			d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			d.manage().window().maximize();
			Thread.sleep(4000);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  d.close();
	  }

}
