package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxes {

	public static void main(String[] args) {
		//1.open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2.Maximize it
		driver.manage().window().maximize();
		
		//3.Navigate to application
		driver.get("https://letcode.in/radio");
		
		//4.Select 'Yes' radio button from 'Select any one' option
		driver.findElement(By.xpath("//input[contains(@type,'checkbox'])[2]")).click();
		
		driver.quit();
	}
        
}
