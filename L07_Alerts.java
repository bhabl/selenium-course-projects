package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L07_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://automationtesting.co.uk/popups.html");
	    driver.findElement(By.cssSelector("#main > div > div:nth-child(8) > div > button")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    

	}

}
