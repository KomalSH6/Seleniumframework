package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import pageobjectmodel.loginpageobject;
import pageobjectmodel.signuppageobject;
import resources.baseclass;
import resources.commanmethod;

public class verifysignup extends baseclass {

	@Test
	public void signup() throws IOException, InterruptedException {

		loginpageobject LPO = new loginpageobject(driver);

		LPO.tryforfree().click();

		Thread.sleep(5000);

		signuppageobject SPO = new signuppageobject(driver);

		SPO.enterfirstname().sendKeys("Komal");

		SPO.enterlastname().sendKeys("SH");

		SPO.enteremail().sendKeys("komal123@gmail.com");

		commanmethod.handledropdown(SPO.selectjobtitle(), 1);
		
		
		SPO.entercompamyname().sendKeys("MNC");

		commanmethod.handledropdown(SPO.selectemployee(), 1);
		
		
		SPO.enterphoneno().sendKeys("1234567890");

		//commanmethod.handledropdown(SPO.selectcountry(), 0);
		
	}

}
