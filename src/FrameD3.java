import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		String vText = driver.findElement(By.className("entry-title")).getText();
		System.out.println(vText);
		
		//int fSize=driver.findElement(By.tagName("iframe")).getSize();
		
   // this to be done
	}

}
//need to gothrough