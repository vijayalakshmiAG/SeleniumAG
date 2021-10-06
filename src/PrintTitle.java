import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println(driver.getTitle());
        String originalWindow = driver.getWindowHandle();
		// driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		driver.findElement(By.linkText("Help")).click();

		Set<String> w = driver.getWindowHandles();
		for (String h : w) {
			driver.switchTo().window(h);
			String title = driver.getTitle();
			if(title.equalsIgnoreCase("Google account Help")) {
				System.out.println(title);	
			driver.close();
			}
		}
		driver.switchTo().window(originalWindow).close();
	}
}*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String>  GID=driver.getWindowHandles();
		Iterator<String> GIT=GID.iterator();
		String Gparent=GIT.next();
		String Gchild=GIT.next();
		driver.switchTo().window(Gchild);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}}
