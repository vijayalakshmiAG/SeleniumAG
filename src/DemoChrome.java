import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String vtitle=driver.getTitle();
		System.out.println(vtitle);
		Thread.sleep(5000);
		

	}

}

/*public class DemoChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("this is the title "+title);
				/*WebDriver driver = new ChromeDriver();
				driver.get("https://www.mortgagecalculator.org/");
				driver.findElement(By.id("homeval")).sendKeys("5000");
				//driver.findElement(By.id("downpayment")).sendKeys("300");
				driver.findElement(By.name("param[downpayment]")).sendKeys("300");
				driver.findElement(By.name("param[downpayment_type]")).click();
				driver.findElement(By.name("intrstsrate")).sendKeys("5.5");
				driver.findElement(By.name("cal")).click();
				String vMPay = driver.findElement(By.xpath("cal")).click();
				
				
				

	}

}*/
