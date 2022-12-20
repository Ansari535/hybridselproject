package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		//step1 : create obj. for skillrary login page
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	    driverutilies.switchTabs(driver);         //switching tab -->we written code in WebDriverUtilies
	    driverutilies.mouseHover(driver, sd.getCoursetab());  //mouse hover on course -->we written code in WebDriverUtilies
		sd.selenium();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilies.doubleclick(driver, ad.getAddbutton()); //call the method
		ad.addtocartbtn();
		driverutilies.alertpopup(driver); //we written code in WebDriverUtilies
	}

}
 // test case passed succesfully