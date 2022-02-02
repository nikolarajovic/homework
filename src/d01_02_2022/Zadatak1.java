package d01_02_2022;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[contains(@class, 'language-selector-button--button--1wgoL')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'language-selector-button--button--1wgoL')]")).click();

//		List<WebElement> elementi = driver.findElements(By.id("u570-modal-title--14"));
//		
//		if (elementi.size() > 0) {
//			System.out.println("Dijalog se prikazao.");
//		} else {
//			System.out.println("Dijalog se nije prikazao.");
//		}

		boolean languagePopup;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]")));
			driver.findElement(By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]"));
			languagePopup = true;
		} catch (Exception e) {
			languagePopup = false;
		}

		if (languagePopup) {
			System.out.println("Dijalog se prikazao.");
		} else {
			System.out.println("Dijalog se nije prikazao.");
		}

	}

}
