package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserProfiling {

	public static void main(String[] args) {
		//Disable the notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//1.Open the browser
		ChromeDriver driver = new ChromeDriver(options); //ctrl + shift + O to import the class
				
		//2.Maximize it
		driver.manage().window().maximize();
				
        //3.Navigate to application
		driver.get("https://www.yatra.com");

	}

}
