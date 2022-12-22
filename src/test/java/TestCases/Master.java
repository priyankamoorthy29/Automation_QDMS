package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.DriverInitialization;

public class Master extends DriverInitialization{
	
	
	Pages.MasterPage master = new Pages.MasterPage();
	
	@Test
	public void Login () {
		
		PageFactory.initElements(driver, master);
		
		master.Master.click();
		
	}
	

}
