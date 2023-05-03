package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ce5 {
	public static void main(String args[]) {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement s1=d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s1.sendKeys("Apple");
		d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		WebDriver dx =new ChromeDriver(co);
		dx.get("https://www.google.com/");
		dx.manage().window().maximize();
		WebElement s2=dx.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s2.sendKeys("selenium");
		dx.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		WebDriver dy =new ChromeDriver(co);
		dy.get("https://www.google.com/");
		dy.manage().window().maximize();
		WebElement s3=dy.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		s3.sendKeys("Cucumber");
		dy.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		String t1=d.getTitle();
		System.out.println(t1);
		String t2=dx.getTitle();
		System.out.println(t2);
		String t3=dy.getTitle();
		System.out.println(t3);
		String w1=d.getWindowHandle();
		System.out.println(w1);
		String w2=dx.getWindowHandle();
		System.out.println(w2);
		String w3=dy.getWindowHandle();
		System.out.println(w3);
	}
	
	
}
