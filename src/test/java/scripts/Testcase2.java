package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoapp();
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	 driverutilies.switchTabs(driver);         //switching tab -->we written code in WebDriverUtilies
	 driverutilies.dropdown(sd.getCoursedd(), pdata.getData("coursedd"));  //copy from data.properties
	
	CoursePage cp=new CoursePage(driver);
	driverutilies.draganddrop(driver, cp.getSeelenium(), cp.getCartarea());
	WebElement loc = cp.getLinkedin();
	Point l = loc.getLocation();
	int x = l.getX();
	int y = l.getY();
	
	driverutilies.scrollBar(driver, x, y);
	cp.linkedinicon();
	
	
	}
	
	

}
