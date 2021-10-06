import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Browser {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
	    int select = 0;
	    System.out.println("1. Chrome");
	    System.out.println("2. Edge");
	    System.out.println("3. Other");
	    System.out.println("Enter your choice");
	    select = sc.nextInt();
		switch (select){
        case 1:
        	System.setProperty("webdriver.chrome.driver","C:\\Automation\\Chrome\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.get("https://www.google.com/");
    		Thread.sleep(5000);
            break;
        case 2:
        	System.setProperty("webdriver.edge.driver","C:\\Automation\\Edge\\msedgedriver.exe");
    		WebDriver driver1 = new EdgeDriver();
    		driver1.get("https://www.google.com/");
            break;
        case 3:
        	System.out.println(" Browser not Found");
            break;
        case 0:
            break;
        default:	
		
	}

	}}
