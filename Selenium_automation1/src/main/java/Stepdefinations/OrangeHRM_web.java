package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OrangeHRM_web {
	WebDriver driver;

	@Given("Launch login page")
	public void open_login_page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("lanuch website");
	}

	@When("Enter valid user name and password")
	public void enter_credentails() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		System.out.println("Enter data");

		System.out.println("lanuch website");
	}

	@Then("User should be login succssfull")
	public void Login() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("Verify data inserted");

		System.out.println("lanuch website");
	}

}
