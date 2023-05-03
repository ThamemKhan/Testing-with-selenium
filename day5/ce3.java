package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver d =new ChromeDriver(co);
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		WebElement id=d.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		id.sendKeys("401");
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		d.switchTo().alert().dismiss();
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		WebElement id2=d.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		id2.sendKeys("402");
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		d.switchTo().alert().accept();
		String msg= d.switchTo().alert().getText();
		System.out.println(msg);

	}

}