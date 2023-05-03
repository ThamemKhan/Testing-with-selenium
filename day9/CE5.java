package day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CE5 {
	WebDriver d;
  @Test
  public void Login() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  WebElement uname=d.findElement(By.name("username"));
	  uname.sendKeys("Suvitha");
	  WebElement pass=d.findElement(By.name("password"));
	  pass.sendKeys("12345");
	  WebElement submit=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  submit.click();
	  Thread.sleep(4000);
	  String title = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	  Assert.assertEquals("Dashboard", title);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();	
  }

  @AfterMethod
  public void afterMethod() {
	  
	  d.close();
	  
  }

}