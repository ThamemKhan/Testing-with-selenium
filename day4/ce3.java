package day4;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class ce3 {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver();
			WebDriver d =new ChromeDriver(co);
			d.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
			d.manage().window().maximize();
			WebElement name=d.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
			name.sendKeys("Sanjeevi");
			WebElement email=d.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
			email.sendKeys("727721eucs134@skcet.ac.in");
			WebElement ename=d.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
			ename.sendKeys("727721eucs134@skcet.ac.in");
			WebElement eemail=d.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
			eemail.sendKeys("727721eucs140@skcet.ac.in");
			d.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
			WebElement add=d.findElement(By.xpath("	//*[@id=\"input-message\"]"));
			add.sendKeys("Enna da Ipadi");
			Thread.sleep(4000);
			d.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
			Thread.sleep(4000);
			d.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
			
		}
	
	}
