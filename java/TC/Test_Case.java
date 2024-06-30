package TC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PO.PO_Search;
import com.qa.util.BrowserManager;
public class Test_Case {
	  
	   @Test
	   @Parameters({"browser","url"})
	   public void t_01_flipkart_search(String browser, String url) {
		   WebDriver driver = BrowserManager.getDriver(browser,url);
		   PO_Search obj = PageFactory.initElements(driver,PO_Search.class);
		   obj.SearchProduct("computer");
	   }
	
}
