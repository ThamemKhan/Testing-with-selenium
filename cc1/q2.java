package cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://www.saucedemo.com/inventory.html");
		d.manage().window().maximize();
		WebElement uname=d.findElement(By.xpath("//*[@id=\"user-name\"]"));
		uname.sendKeys("standard_user");
		WebElement pass=d.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");	
		d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		if(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).isEnabled()) {
			System.out.println("A to Z enabled");
		}
		if(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).isEnabled()) {
			System.out.println("Z to A enabled");
		}
		String name=d.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("A to Z :"+name);
		Thread.sleep(1000);
		Select se=new Select(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		se.selectByIndex(1);
		System.out.println("Z to A : "+d.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText());
		if(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).isEnabled()) {
			System.out.println("Low price to High price is enabled");
		}
		if(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).isEnabled()) {
			System.out.println("High Price to Low Price is enabled");
		}
		Select se2=new Select(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		se2.selectByIndex(3);
		System.out.println("High to Low : "+d.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText());
		Select se1=new Select(d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		se1.selectByIndex(2);
		System.out.println("Low to High : "+d.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText());

	}

}