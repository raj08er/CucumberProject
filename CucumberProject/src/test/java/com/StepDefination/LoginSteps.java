package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("User Is On LoginPage")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on LoginPage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("User Enters Username and Password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: User enters Username and Password");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("Click On Login button")
	public void click_on_login_button() {
		System.out.println("Step3: User is clicking on Login Button");
		driver.findElement(By.name("Submit")).click();
	}

	@Then("User Should Land On The HomePage")
	public void user_should_land_on_the_home_page() {
		System.out.println("Step4: User lands on Home Page");
		driver.close();
	}

}
