package AssertionListener.AssertionListenerExample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(AssertionListener.AssertionListenerExample.ListenerTest.class)
public class ListenerMain extends ListenerTest {
	
	AssertionExample a;
	WebDriver d;
	SoftAssert sa=new SoftAssert();
	
  @BeforeClass
  public void openBrowser() {
	  String key="webdriver.chrome.driver";
		String value="E:\\Velocity\\SeleniumChromeDriver\\chromedriver.exe";
		String url="http://localhost/login.do";

		System.setProperty(key, value);
		 d = new ChromeDriver();
		 d.manage().window().maximize();
		 d.manage().deleteAllCookies();
		 d.navigate().to(url);
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 a=new AssertionExample(d);
  }
  
  @AfterClass
  public void closeBrowser() {
	  d.close();
  }
	  
  @Test(priority=0)
  public void usernameTest() throws EncryptedDocumentException, IOException {
	  System.out.println("Username page");
	 //String u= a.setUsername("Admin");
	  sa.assertNotNull(a.setUsername("Admin"),"Test Pass");
	  //sa.assertAll();
	// a.setUsername();
	//  a.setPassword();
	 // a.login();
  }
  @Test(priority=1)
  public void passwordTest() throws EncryptedDocumentException, IOException {
	  System.out.println("Password page");
	  String p=a.setPassword("manager");
	  sa.assertNotEquals(p, "Akshay","Test Pass");
	 // a.setPassword();
  }
	
  @Test(priority=2)
  public void loginTest() {
	  System.out.println("Login page");
	  a.login();

}
}