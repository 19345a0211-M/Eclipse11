package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver(); //ctrl + shift + O to import the class
		
		//2.Maximize it
		driver.manage().window().maximize();
		
		//3.Navigate to application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//Go inside the frame that contains 'DEPRECATED' hyperlink
		driver.switchTo().frame("classFrame");
		
		//4.Click on 'DEPRECATED' 
		driver.findElement(By.linkText("DEPRECATED")).click();

	}

}
