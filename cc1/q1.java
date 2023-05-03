package cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class q1 {

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
		d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		String num=d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
		 if(num.equals("1")) {
			 System.out.println("Cart Added");
		 }
		 else {
			 System.out.println("Not Added");
		 }
		 d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		 if(d.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]")).isEnabled()) {
			 System.out.println("Contents Shown");
		 }
		 else {
			 System.out.println("Not Shown");
		 }
		 d.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		 String info=d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 String einfo="Checkout: Your Information";
		 if(info.equals(einfo)) {
			 System.out.println("Your Information Page is Shown");
		 }
		 else {
			 System.out.println("Not Found");
		 }
		 WebElement fname=d.findElement(By.xpath("//*[@id=\"first-name\"]"));
		 fname.sendKeys("Sanjeevi");
		 WebElement lname=d.findElement(By.xpath("//*[@id=\"last-name\"]"));
		 lname.sendKeys("C S");
		 WebElement pin=d.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		 pin.sendKeys("638654");
		 d.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		 String oview=d.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		 if(oview.equals("Checkout: Overview")) {
			 System.out.println("Product Overview Showed");
		 }
		 else {
			 System.out.println("Not Shown");
		 }
		 String pname=d.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		 System.out.println("Product Name: "+pname);
		 String price=d.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		 System.out.println("Price: "+price);
		 String title=d.getTitle();
			String eTitle="Swag Labs";
			if(eTitle.equals(title)) {
				System.out.println("Current Title is correct");
			}
			else {
				System.out.println("No Match");
			}
		String Curl=d.getCurrentUrl();
		if(Curl.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println("Current Url is Correct");
		}
		else {
			System.out.println("No Match");
		}
		 
		

	}

}