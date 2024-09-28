package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
						"C://Users//indig//OneDrive//Documents//chromedriver-win64//chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}
}
