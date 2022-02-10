package d07_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public CartPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public boolean isProductInTheCart() {
		String value = driver.findElement(By.className("input-text")).getAttribute("value");
		return value.equals("2");
	}

	public WebElement getRemoveButton() {
		return driver.findElement(By.className("remove"));
	}

	public boolean isCartEmpty() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return driver.findElement(By.xpath("//*[contains(@class, 'cart-empty woocommerce-info')]")).getText()
				.contains("Your cart is currently empty.");
	}

}
