package d28_01_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.concurrent.ThreadPerTaskExecutor;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate()
				.to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info add-new')]")).click();

			System.out.println("Enter name: ");
			String name = s.next();
			System.out.println("Enter last name: ");
			String lastName = s.next();
			System.out.println("Enter department: ");
			String department = s.next();
			System.out.println("Enter phone number: ");
			String phone = s.next();

			driver.findElement(By.id("name")).sendKeys(name + " " + lastName);
			driver.findElement(By.id("department")).sendKeys(department);
			driver.findElement(By.id("phone")).sendKeys(phone);
			driver.findElement(By.xpath("//*[contains(@class, 'table table-bordered')]/tbody/tr[4]/td[4]/a[1]"))
					.click();
		}

		Thread.sleep(3000);

		driver.close();

	}

}
