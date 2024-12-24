package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L04_LocatingByLinkText {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://automationtesting.co.uk");
     driver.findElement(By.cssSelector("#sidebar > a")).click();
     WebDriverWait wait = new WebDriverWait(driver, 10);
     WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ACTIONS")));
     element.click();


//     driver.findElement(By.linkText("ACTIONS")).click();
 }

}
