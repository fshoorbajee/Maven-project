package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class MavenExample {

	WebDriver driver;

	@Test
	public void mavenTest() {
		System.out.println("hello.....");

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\eclipse\\Libraries\\WebDrivers\\geckodriver.exe");
		// driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Libraries\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("phantomjs.binary.path",
		// "C:\\eclipse\\Libraries\\WebDrivers\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		// driver = new PhantomJSDriver();

		driver.get("http://google.com");
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();

		String title;
		title = driver.getCurrentUrl();
		System.out.println(title);
		this.takeSnapShot(driver, "c://test.png");

		// @Test
		// public void mavenTestChrome() {
		// System.out.println("hello.chrome...");
		//
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\eclipse\\Libraries\\WebDrivers\\chromedriver.exe");
		//
		// driver.get("http://cnn.com");

	}

	private void takeSnapShot(WebDriver driver2, String string) {
		// TODO Auto-generated method stub

	}

}
