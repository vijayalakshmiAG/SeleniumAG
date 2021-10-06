import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumD2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String vtitle=driver.getTitle();
		//System.out.println(driver.getTitle());
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='password-visibility-toggle' and @class='button__password-visibility']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.name("userName")).sendKeys("xyz");
		driver.findElement(By.linkText("Join now")).click();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		//Thread.sleep(5000);
		driver.close();
		
		
		
		/*driver.findElement(By.id("shelter")).sendKeys("100");
		driver.findElement(By.id("monthlyPay")).sendKeys("100");
		driver.findElement(By.id("monthlyOther")).sendKeys("100");
		driver.findElement(By.id("totalAnnualExpenses")).sendKeys("100");
		driver.findElement(By.id("totalMonthlyIncome")).sendKeys("100");
		Thread.sleep(5000);
		driver.close();*/
	}


		

	}


