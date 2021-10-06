import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchD2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());	
		driver.findElement(By.name("q")).sendKeys("SELENIUM");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		String vsearch=driver.findElement(By.xpath("(//*[@class='gLFyf gsfi'])")).getAttribute("value");
		if(vsearch == vsearch)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
		
		driver.close();

	}

}


/*String search_data = "SELENIUM";
		driver.findElement(By.name("q")).sendKeys(search_data);
		driver.findElement(By.xpath("btnK")).click();

		/*String searched_data = driver.findElement(By.xpath("//form[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).getAttribute("value");

		if ( search_data.equals(searched_data)) {
		System.out.print("passs");
		}else {
		System.out.print("fail");
		}
		Thread.sleep(3000);
		driver.close();
		Search Google or type a URL*/
