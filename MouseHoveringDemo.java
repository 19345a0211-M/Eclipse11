package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoveringDemo {

	public static void main(String[] args) {
		//1.Open the browser
        ChromeDriver driver = new ChromeDriver(); //ctrl + shift + O to import the class
		
		//2.Maximize it
		driver.manage().window().maximize();
		
		//3.Navigate to application
		driver.get("https://www.ebay.com");
		
		//4.Hover the pointer over 'Electronics'
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple")));
		
		//5.click on Apple in sub menu
		driver.findElement(By.linkText("Apple")).click();

	}

}
