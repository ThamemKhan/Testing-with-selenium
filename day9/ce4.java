package day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

public class ce4 {
	WebDriver d;
  @Test
  public void Openurl() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement uname=d.findElement(By.name("username"));
	  uname.sendKeys("admin");
	  WebElement pass=d.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  WebElement submit=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  submit.click();
  }
  @Parameters("Browser")
  
  @BeforeMethod
  public void beforeMethod(String browser) {
	  
	  if(browser.equals("Chrome")) {
		  ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			d=new ChromeDriver();
			d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			d.manage().window().maximize();	
	  }
	  
	  else if(browser.equals("Edge")) {
		  EdgeOptions co=new EdgeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.edgedriver();
		  d=new EdgeDriver();
		  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			d.manage().window().maximize();	 
	  }
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  d.close();
  }

}