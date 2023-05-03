package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ce1 {
	public static void main(String[] args) {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://demoqa.com/droppable/");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement source= d.findElement(By.id("draggable"));
		WebElement destination=d.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform();
		
	}
}