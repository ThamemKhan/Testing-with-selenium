package day6;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ce1 {
	WebDriver d;
  @Test
  public void checkTitle() {
	  d.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String eTitle="Guest Registration Form - User Registration";
	  String cTitle=d.getTitle();
	  Assert.assertEquals(eTitle, cTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver();
	  d=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }

}
