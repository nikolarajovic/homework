package d04_02_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void ratingCheck() {
		driver.manage().window().maximize();

		driver.navigate().to("https://www.udemy.com/");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Select sortBy = new Select(driver.findElement(By.id("u194-form-group--17")));
		sortBy.selectByVisibleText("Highest Rated");
//		String firstResult = driver.findElement(By.xpath(
//				"//div[contains(@class, 'course-list--container--3zXPS')]/div[1]//span[contains(@class, 'udlite-heading-sm star-rating--rating-number--2o8YM')]"))
//				.getText();
//		String lastResult = driver.findElement(By.xpath(
//				"//div[contains(@class, 'course-list--container--3zXPS')]/div[last()]//span[contains(@class, 'udlite-heading-sm star-rating--rating-number--2o8YM')]"))
//				.getText();

		List<WebElement> list = driver.findElements(By.xpath("//*[@data-purpose = 'rating-number']"));
		String firstResult = list.get(0).getText();
		int listSize = list.size();
		String lastResult = list.get(listSize - 1).getText();
		boolean firstResultIsBetter;
		if (Double.parseDouble(firstResult) >= Double.parseDouble(lastResult)) {
			firstResultIsBetter = true;
		} else {
			firstResultIsBetter = false;
		}
		Assert.assertEquals(firstResultIsBetter, true, "Rating function failed.");
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}

}
