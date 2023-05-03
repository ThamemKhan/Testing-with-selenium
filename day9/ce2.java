package day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
public class ce2 {
	WebDriver d;
  @Test
  public void Testcase1() {
	  
	  String title=d.getTitle();
	  Assert.assertEquals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN", title);
	  String url=d.getCurrentUrl();
	  Assert.assertEquals("https://www.godaddy.com/en-in", url);
	  
  }
  
  @Test
  public void Testcase02() {
	  
	  d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  
  }
  
  
  @Test
  public void Testcase03() {
	  
	  d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  d.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  String title=d.getTitle();
	  System.out.println(title);
	  d.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
	  d.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")).isEnabled();
	  WebElement input=d.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
	  input.sendKeys("Food");

  }

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		d=new ChromeDriver();
		d.get("https://www.godaddy.com/");
		d.manage().window().maximize();	
		Thread.sleep(4000);
		
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }

}