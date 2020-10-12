package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form/");

		// 8 identifiers
		WebElement firstName = driver.findElement(By.id("firstName")); // step1

		firstName.sendKeys("Ajay"); // step2

		driver.findElement(By.id("lastName")).sendKeys("Lattu"); // step1 + step2

	}

}
