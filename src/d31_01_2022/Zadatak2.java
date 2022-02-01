package d31_01_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.concurrent.ThreadPerTaskExecutor;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.navigate().to("https://geodata.solutions/");

		Select dropdownCountry = new Select(driver.findElement(By.name("country")));
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		
		dropdownCountry.selectByVisibleText("Algeria");
		dropdownState.selectByVisibleText("Algiers");
		dropdownCity.selectByVisibleText("Rouiba");
		
//		kako zadrzati nakon selektiranja jednog dropdowna

		driver.close();

	}

}
