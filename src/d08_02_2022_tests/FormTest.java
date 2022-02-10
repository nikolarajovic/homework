package d08_02_2022_tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d07_02_2022_pages.CartPage;
import d07_02_2022_pages.FromPage;
import d07_02_2022_pages.MainPage;
import d07_02_2022_pages.ProductPage;
import d08_02_2022_pages.FormPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FormTest {

	private WebDriver driver;
	private FormPage formPage;
	private WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("file:///C:/Users/Rajovic/Downloads/form%20(1).html");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert softAssertion = new SoftAssert();

		formPage = new FormPage(driver, wait);
	}

	@Test
	public void formTest() throws InterruptedException, IOException {
		File file = new File("files/FormData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("form");
		DataFormatter formatter = new DataFormatter();

		for (int i = 1; i < 7; i++) {
			String fullName = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			String gender = sheet.getRow(i).getCell(1).getStringCellValue();
			String dot = formatter.formatCellValue(sheet.getRow(i).getCell(2));
			String email = formatter.formatCellValue(sheet.getRow(i).getCell(3));
			String role = formatter.formatCellValue(sheet.getRow(i).getCell(4));
//			Ne postoji tekstualni value npr read_books, moralo bi preko lokatora da se unese
//			String wod = sheet.getRow(i).getCell(5).getStringCellValue();
			int wod = 1;
			String comment = formatter.formatCellValue(sheet.getRow(i).getCell(6));

			formPage.dataInput(fullName, gender, dot, email, role, wod, comment);
			formPage.getSubmitButton().click();
			
			Thread.sleep(1000);
			Assert.assertTrue(formPage.isDataSaved(), "Data is not saved.");
			driver.navigate().refresh();
		}

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}

}
