package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ce5b {

	public static void main(String[] args) {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://j2store.net/free/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		List<WebElement> listname=d.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
		for(int i=0;i<listname.size();i++) {
				System.out.println(listname.get(i).getText());
		}

	}

}
