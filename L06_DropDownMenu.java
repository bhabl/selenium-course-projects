package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropDownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhaba\\Desktop\\Notes\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://automationtesting.co.uk/dropdown.html");
	    //System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
	    Select carSelection = new Select(driver.findElement(By.name("cars")));
	    carSelection.selectByVisibleText("BMW");
	    

	}

}
