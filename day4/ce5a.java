package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ce5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://j2store.net/free/");
		d.manage().window().maximize();
		String expectedUrl = "https://j2store.net/free/";
		String currentUrl = d.getCurrentUrl();
		if (currentUrl.equals(expectedUrl)) {
		    System.out.println("The current URL matches the expected URL.");
		} else {
		    System.out.println("The current URL does not match the expected URL.");
		}
		d.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();	
		String eUrl = "https://j2store.net/free/index.php/shop?filter_catid=11";
		String cUrl = d.getCurrentUrl();
		if (cUrl.equals(eUrl)) {
		    System.out.println("The current URL matches the expected clothing URL.");
		} else {
		    System.out.println("The current URL does not match the expected URL.");
		}

	}

}