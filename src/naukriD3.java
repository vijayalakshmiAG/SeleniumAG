import java.util.Set;


import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriD3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		System.out.println(driver.getTitle());
		 // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s =driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator <String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
            driver.switchTo().window(child_window);
 
            System.out.println(driver.switchTo().window(child_window).getTitle());
            Thread.sleep(5000);
            driver.close();
            }
            }
            //switch to the parent window
            driver.switchTo().window(parent);
            Thread.sleep(5000);
            driver.close();
            }
	}


//done-need to gothrough