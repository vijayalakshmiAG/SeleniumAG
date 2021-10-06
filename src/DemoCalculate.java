import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoCalculate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String vtitle=driver.getTitle();
		System.out.println(vtitle);
				driver.get("https://www.mortgagecalculator.org/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				WebDriverWait wait= new WebDriverWait(driver,20);
				driver.findElement(By.id("homeval")).sendKeys("5000");
				//driver.findElement(By.id("downpayment")).sendKeys("300");
				driver.findElement(By.name("param[downpayment]")).sendKeys("300");
				//driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.id("intrstsrate")));
				driver.findElement(By.id("intrstsrate")).sendKeys("5.5");
				driver.findElement(By.name("calculatewrong")).click();
				String vMPay = driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
				System.out.println(vMPay);
	}}

				
//*[@id="calc"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input
//*[@id="calc"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3

	
