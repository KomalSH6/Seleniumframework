package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmodel.loginpageobject;
import resources.baseclass;
import resources.commanmethod;
import resources.constant;

public class verifylogin extends baseclass {

	@Test
	public void login() throws IOException {

		initializeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		loginpageobject LPO = new loginpageobject(driver);

		LPO.enterUsername().sendKeys(constant.username);

		LPO.enterPassword().sendKeys(constant.password);

		LPO.clicklogin().click();

		
		
		
		String actualText = LPO.errortext().getText();

		String expectedText = constant.expectedmessage;

		commanmethod.handleassert(actualText, expectedText, "ErrorMessage");

		
		
		//String privacyactualText=LPO.privacy().getText();
		
		//String privacytexpextedtext="Privacy";
		
		//commanmethod.handleassert(privacyactualText, privacytexpextedtext, "error");
	}

}
