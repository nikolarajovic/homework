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

import io.netty.util.concurrent.ThreadPerTaskExecutor;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait waitForVideo = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.manage().window().maximize();
		driver.navigate().to("https://videojs.com/city");

		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")).click();

//		List<WebElement> elementi = driver.findElements(By.xpath("//button[contains(@class, 'vjs-big-play-button')]"));
//		if (elementi.size() > 0) {
//			System.out.println("Dugme za play je pretisnuto.");
//		} else {
//			System.out.println("Dugme za play nije pretisnuto.");
//		}

		boolean playClicked;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]"));
			playClicked = true;
		} catch (Exception e) {
			playClicked = false;
		}

		if (playClicked) {
			System.out.println("Dugme za play je pretisnuto.");
		} else {
			System.out.println("Dugme za play nije pretisnuto.");
		}

		waitForVideo.until(ExpectedConditions
				.attributeContains(By.xpath("//button[contains(@class, 'vjs-ended')]"), "title", "Replay"));
		boolean videoFinished;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-ended')]"));
			videoFinished = true;
		} catch (Exception e) {
			videoFinished = false;
		}

		if (videoFinished) {
			System.out.println("Video je gotov.");
		} else {
			System.out.println("Video nije gotov.");
		}
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
