package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;

public class commanmethod {

	public static void handledropdown(WebElement a, int index) {

		Select s = new Select(a);

		s.selectByIndex(index);
	}

	public static void handleassert(String AT, String ET, String Message) {

		SoftAssert assertion = new SoftAssert();

		AssertJUnit.assertEquals(AT, ET, "Message");

		assertion.assertAll();

	}

}
