package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {

	public WebDriver driver; // this driver is null -don't have scope

	private By username = By.xpath("//input[@id='username']");

	private By password = By.xpath("//input[@id='password']");

	private By login = By.xpath("//input[@id='Login']");

	private By TryforFree = By.xpath("//a[@id='signup_link']");

	By errorText = By.xpath("//div[@id='error']");

	By privacy=By.xpath("//a[@id='privacy-link']");
	
	public loginpageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement clicklogin() {

		return driver.findElement(login);
	}

	public WebElement tryforfree() {

		return driver.findElement(TryforFree);

	}

	public WebElement errortext() {

		return driver.findElement(errorText);
	}
	
	public WebElement privacy() {

		return driver.findElement(privacy);
	}
	
}
