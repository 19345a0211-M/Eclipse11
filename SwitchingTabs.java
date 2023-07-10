package Demo;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize it
		driver.get("https://www.facebook.com/"); //Navigate to application
		driver.findElement(By.linkText("Instagram")).click();  //click on Instagram
		
		//5.Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); 
		driver.switchTo().window(tabs.get(1));
		
		//wait for the next page to load completely
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		//6. write 'abc@gmail.com' in the email textbox of instagram page
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		
		

	}

}
