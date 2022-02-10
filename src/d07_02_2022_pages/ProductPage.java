package d07_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public ProductPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void scrollToAddToCartButton() {
		js = (JavascriptExecutor) driver;
		WebElement addToCart = driver.findElement(By.name("add-to-cart"));
		js.executeScript("arguments[0].scrollIntoView", addToCart);
	}

	public WebElement getQuantityUpButton() {
		return driver.findElement(By.xpath("//*[contains(@class, 'quantity-button quantity-up')]"));
	}

	public WebElement getAddToCartButton() {
		return driver.findElement(By.name("add-to-cart"));
	}

	public boolean isTextFound() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("woocommerce-message"))));
		return driver.findElement(By.className("woocommerce-message")).getText().contains("have been added to your cart");
	}

	public WebElement getViewCartButton() {
		return driver.findElement(By.xpath("//*[contains(@class, 'button wc-forward')]"));
	}

}
