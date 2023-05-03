package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ce4 {

	public static void main(String[] args) {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://www.abhibus.com/bus-ticket-booking");
		d.manage().window().maximize();
		WebElement id=d.findElement(By.xpath("//*[@id=\"source\"]"));
		id.sendKeys("Pollachi");
		WebElement id2=d.findElement(By.xpath("//*[@id=\"destination\"]"));
		id2.sendKeys("Goa");
		d.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[7]/a")).click();
		d.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		
		
		

	}

}
