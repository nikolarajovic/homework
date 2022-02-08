package d04_02_2022;

import org.testng.annotations.Test;

import io.netty.util.concurrent.ThreadPerTaskExecutor;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Zadatak3 {

	WebDriver driver;
	Helper helper;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void testSortByAge() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to(
				"https://www.bu.edu/tech/services/cccs/websites/www/wordpress/how-to/sortable-searchable-tables/#:~:text=Adding%20the%20%E2%80%9Csortable%E2%80%9D%20class%20to,cell%20in%20an%20HTML%20table.");

		helper.scrollToElement(By.xpath("//*[@id = 'post-76995']//table[1]"));
		Thread.sleep(3000);
		helper.clickOnElementByJS(By.xpath("//*[@id = 'post-76995']//table[1]//th[2]"));
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//*[@id = 'post-76995']//table[1]//tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int noOfRows = rows.size();

		String[] age = new String[noOfRows];
		int[] ageNo = new int[noOfRows];

		for (int i = 0; i < age.length; i++) {
			age[i] = driver.findElement(By.xpath("//*[@id='post-76995']/table[1]/tbody/tr[" + i + "/td[1]")).getText();
			ageNo[i] = Integer.parseInt(age[i]);
		}

		for (int i = 1; i < ageNo.length; i++) {

		}

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
