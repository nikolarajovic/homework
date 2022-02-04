package d03_02_2022;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		Scanner s = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://www.wikipedia.org/");

		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, 'central-featured')]//a"));

		for (int i = 0; i < list.size(); i++) {
			js.executeScript("window.open(arguments[0]);", list.get(i));
		}

	}

}
