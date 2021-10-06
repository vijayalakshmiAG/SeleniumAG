import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BudgetCal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String vtitle=driver.getTitle();
		System.out.println(vtitle);
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.findElement(By.id("food")).sendKeys("100");
		driver.findElement(By.id("clothing")).sendKeys("100");
		driver.findElement(By.id("shelter")).sendKeys("100");
		driver.findElement(By.id("monthlyPay")).sendKeys("100");
		driver.findElement(By.id("monthlyOther")).sendKeys("100");
		driver.findElement(By.id("totalAnnualExpenses")).sendKeys("100");
		driver.findElement(By.id("totalMonthlyIncome")).sendKeys("100");
		Thread.sleep(5000);
		driver.close();
	}

}
