package AssertionListener.AssertionListenerExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListenerExample {
	
	private static final String String = null;

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	WebDriver driver;
	
	public ListenerExample(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String setUsername(String u) throws EncryptedDocumentException, IOException {
//		String path="E:\\actitime.xlsx";
//		FileInputStream f=new FileInputStream(path);
//		String val = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(val);
		username.sendKeys(u);
		return u;
	}
	public String setPassword(String p) throws EncryptedDocumentException, IOException {
//		String path="E:\\actitime.xlsx";
//		FileInputStream f= new FileInputStream(path);
//		String val1=WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(val1);
		pwd.sendKeys(p);
		return p;
	}
	public void login() {
		login.click();
	}
	

}
