package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppageobject {

	public WebDriver driver;

	By Firstname = By.xpath("//input[@name='UserFirstName']");

	By Lastname = By.xpath("//input[@name='UserLastName']");

	By Workemail = By.xpath("//input[@name='UserEmail']");

	By Jobtitle = By.xpath("//select[@name='UserTitle']");

	By Company = By.xpath("//input[@name='CompanyName']");

	By Employee = By.xpath("//select[@name='CompanyEmployees']");

	By Phone = By.xpath("//input[@name='UserPhone']");

	By Country = By.xpath("//select[@name='CompanyCountry']");

	public signuppageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement enterfirstname() {

		return driver.findElement(Firstname);
	}

	public WebElement enterlastname() {

		return driver.findElement(Lastname);
	}

	public WebElement enteremail() {

		return driver.findElement(Workemail);

	}

	public WebElement selectjobtitle() {

		return driver.findElement(Jobtitle);
	}

	public WebElement entercompamyname() {

		return driver.findElement(Company);
	}

	public WebElement selectemployee() {

		return driver.findElement(Employee);
	}

	public WebElement enterphoneno() {

		return driver.findElement(Phone);
	}

	public WebElement selectcountry() {

		return driver.findElement(Country);
	}

}
