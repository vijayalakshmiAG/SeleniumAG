import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selector {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.mortgagecalculator.org/");
			driver.manage().window().maximize();
			Select select= new Select(driver.findElement(By.name("param[start_month]")));
			select.selectByIndex(4);
			Thread.sleep(4000);
			select.selectByValue("8");
			Thread.sleep(4000);
			select.selectByVisibleText("Dec");
			Thread.sleep(4000);
			driver.close();
			

	}

}
//need to gothrough