package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L05_LocatingByCSS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://automationtesting.co.uk/buttons.html");
     driver.findElement(By.cssSelector("#btn_one")).click();

 }

}
