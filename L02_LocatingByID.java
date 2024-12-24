package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L02_LocatingByID {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://automationtesting.co.uk/buttons.html");
     driver.findElement(By.id("btn_one")).click();
//     WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
//     WebElement btnOne = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_one")));
//     btnOne.click();
 }

}
