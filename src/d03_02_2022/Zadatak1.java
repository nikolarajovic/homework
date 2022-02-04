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

public class Zadatak1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		Scanner s = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://www.google.com/");
		WebElement body = driver.findElement(By.xpath("//body"));

		System.out.print("Unesite zeljenu boju: ");
		String color = s.next();

		js.executeScript("arguments[0].style='background:' + arguments[1];", body, color);

	}

}
