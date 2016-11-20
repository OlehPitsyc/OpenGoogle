package Test911;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qagroup.homework911.GoogleKeyboardApp;
import com.qagroup.homework911.InputDataPage;
import com.qagroup.homework911.OpenKeyboard;
import com.qagroup.homework911.ResultPage;

public class TestInput911 {

	private GoogleKeyboardApp google = new GoogleKeyboardApp();
	private OpenKeyboard keyboardItem;
	private ResultPage resultPage;
	
	@BeforeClass
	
	public void setUp(){
		keyboardItem = google.openStartPage();
	}
	
	@Test
	
	public void testTextInInputByKeyboard(){
		resultPage =keyboardItem.findAndOpenKeyboar();
		resultPage.serachResultPage();
		resultPage.getTextFromIput();
		String a = "911";
		Assert.assertEquals(resultPage.getTextFromIput(), a);
	
	}
}
