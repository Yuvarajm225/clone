 package com.Stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefinition1 {
	public static WebDriver driver = AdactinRunner.driver;
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		driver.get("http://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("YuvarajElumalai");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("12345678");
	}

	@Then("^user Click The Login Button And It Navigates the To the Serch Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_the_To_the_Serch_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@Given("^user Must Select the Options$")
	public void user_Must_Select_the_Options() throws Throwable {
	}

	@When("^user Select Location In The Select Location Field$")
	public void user_Select_Location_In_The_Select_Location_Field() throws Throwable {
		WebElement l = driver.findElement(By.id("location"));
		Select a = new Select(l);
		a.selectByVisibleText("Paris");
	}

	@When("^user Select Hotels In The Select Hotels Field$")
	public void user_Select_Hotels_In_The_Select_Hotels_Field() throws Throwable {
		WebElement h = driver.findElement(By.id("hotels"));
		Select b = new Select(h);
		b.selectByVisibleText("Hotel Sunshine");	}

	@When("^user Select Room Type In The Select Room Type Field$")
	public void user_Select_Room_Type_In_The_Select_Room_Type_Field() throws Throwable {
		WebElement r = driver.findElement(By.id("room_type"));
		Select c = new Select(r);
		c.selectByVisibleText("Super Deluxe");
	}

	@When("^user Select Room Nos In The Select Room Nos Field$")
	public void user_Select_Room_Nos_In_The_Select_Room_Nos_Field() throws Throwable {
		WebElement n = driver.findElement(By.id("room_nos"));
		Select d = new Select(n);
		d.selectByVisibleText("2 - Two");
	}

	@When("^user Enter The Datepick_In And Clear  Datepick_In Field$")
	public void user_Enter_The_Datepick_In_And_Clear_Datepick_In_Field() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).clear();
	}

	@When("^user Enter The Datepick_In In And Pass SendKeys Datepick_In Field$")
	public void user_Enter_The_Datepick_In_In_And_Pass_SendKeys_Datepick_In_Field() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).sendKeys("10/01/2023");
	}

	@When("^user Enter The Datepick_Out And Clear Datepick_Out Field$")
	public void user_Enter_The_Datepick_Out_And_Clear_Datepick_Out_Field() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).clear();
	}

	@When("^user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field$")
	public void user_Enter_The_Datepick_Out_And_Pass_SendKeys_Datepick_Out_Field() throws Throwable {
		driver.findElement(By.id("datepick_out")).sendKeys("15/01/2023");
	}

	@When("^user Enter The Adult_Room In The Adult_Room Field$")
	public void user_Enter_The_Adult_Room_In_The_Adult_Room_Field() throws Throwable {
		WebElement ar = driver.findElement(By.id("adult_room"));
		Select e = new Select(ar);
		e.selectByVisibleText("2 - Two");
	}

	@When("^user Enter The Child_Room In The Child_Room Field$")
	public void user_Enter_The_Child_Room_In_The_Child_Room_Field() throws Throwable {
		WebElement cr = driver.findElement(By.id("child_room"));
		Select f = new Select(cr);
		f.selectByVisibleText("2 - Two");
	}

	@Then("^user Click The Submit Button$")
	public void user_Click_The_Submit_Button() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@Given("^user Must Select the Page Options$")
	public void user_Must_Select_the_Page_Options() throws Throwable {
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user Click The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		driver.findElement(By.id("continue")).click();
	}

	@Given("^Enter the Options$")
	public void enter_the_Options() throws Throwable {
	}

	@When("^user Enter The Fname In The Fname Field$")
	public void user_Enter_The_Fname_In_The_Fname_Field() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("Yuvaraj");
	}

	@When("^user Enter The Lname In The Lname Field$")
	public void user_Enter_The_Lname_In_The_Lname_Field() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("Elumalai");
	}

	@When("^user Enter The Addres In The Addres Field$")
	public void user_Enter_The_Addres_In_The_Addres_Field() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("Madurai");;
	}
	@When("^user Enter The Ccno In The Ccno Field$")
	public void user_Enter_The_Ccno_In_The_Ccno_Field() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	}

	@When("^user Select Cct In The Cct Field$")
	public void user_Select_Cct_In_The_Cct_Field() throws Throwable {
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select g = new Select(cc);
		g.selectByVisibleText("Other");
	}

	@When("^user Select Em In The Em Field$")
	public void user_Select_Em_In_The_Em_Field() throws Throwable {
		WebElement mn = driver.findElement(By.id("cc_exp_month"));
		Select i = new Select(mn);
		i.selectByVisibleText("October");
	}

	@When("^user Select Ey In The Ey Field$")
	public void user_Select_Ey_In_The_Ey_Field() throws Throwable {
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select h1 = new Select(yr);
		h1.selectByVisibleText("2022");
	}

	@When("^user Enter The Cvv In The Ccv Field$")
	public void user_Enter_The_Cvv_In_The_Ccv_Field() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("000");
	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("^user Click The Logout Button And Exit The Appllication$")
	public void user_Click_The_Logout_Button_And_Exit_The_Appllication() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	}

	@Then("^to Tack Screen Shot$")
	public void to_Tack_Screen_Shot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File des = new File("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\CuCu.png");
		FileUtils.copyFile(as, des);

	}
}
