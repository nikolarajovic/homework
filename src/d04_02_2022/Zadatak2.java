package d04_02_2022;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Zadatak2 {

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
	public void f() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com/");
		driver.findElement(By.name("q")).sendKeys("2021 Complete Python Bootcamp From Zero to Hero in Python");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		helper.clickOnElementByJS(By.id("u364-popper-trigger--245"));

//		if (helper.elementExists(By.xpath("//div[contains(@class, 'slider-menu--cta-button--3eii3')]//button"))) {
//			helper.clickOnElementByJS(By.xpath("//div[contains(@class, 'slider-menu--cta-button--3eii3')]//button"));
//		} else {
//			System.out.println("Element does not exists.");
//		}

		boolean buyNowButton = helper.elementExists(By.xpath("//div[contains(@class, 'slider-menu--cta-button--3eii3')]//button"));
		Assert.assertEquals(buyNowButton, true, "There is no Buy Now button.");
		
		helper.clickOnElementByJS(By.xpath("//div[contains(@class, 'slider-menu--cta-button--3eii3')]//button"));
		
		String signUpPage = driver.findElement(By.id("auth-to-udemy-title")).getText();
		Assert.assertEquals(signUpPage, "Sign Up and Start Learning!", "Sign up page didn't load.");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
