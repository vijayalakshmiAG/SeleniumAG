import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		int vSize= driver.findElements(By.tagName("a")).size();
		System.out.println(vSize);
		
		for(int i=0;i<vSize;i++)
		{
			//String vLink= driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			//String vLink= driver.findElements(By.tagName("a")).get(i).getText();
			//if
			driver.close();
			
		}//if the link contains signin, then is should click on sign and break the loop

	}

}
