package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features = "C:\\Users\\elang\\eclipse-workspace\\cucumber\\src\\test\\java\\com\\feature\\Adactin.feature",
monochrome = false,
dryRun = false,
strict = false,
glue = "com.Stepdefinition",
plugin = {"html:Reports/Adactin_Cucumber.html",
		"pretty", "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
		"json:Reports/JsonFile.json"})

public class AdactinRunner {
	
public static WebDriver driver;
@BeforeClass
public static void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	
}
@AfterClass
public static void close() {
driver.close();
}
}
