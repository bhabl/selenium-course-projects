package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

public class L11_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://automationtesting.co.uk/popups.html");
	    driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
	    String mainWindow = driver.getWindowHandle();
	    Set<String> sets = driver.getWindowHandles();
	    Iterator<String> itr = sets.iterator();
	    while(itr.hasNext()) {
	    	String child = itr.next();
	    	if(!mainWindow.equalsIgnoreCase(child)) {
	    		Thread.sleep(3000);
	    		driver.switchTo().window(child);
	    		driver.close();
	    	}
	    }
	    Thread.sleep(3000);
	    driver.switchTo().window(mainWindow);

	}

}
