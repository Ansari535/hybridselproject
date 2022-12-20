package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s1=new SkillraryLoginPage(driver);
		s1.searchtextbox(pdata.getData("search")); //copy from data.properties
		s1.searchbutton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.corejavacourse();
		
		WishlistPage w=new WishlistPage(driver);
		 w.closepopup();
		 driverutilies.switchFrame(driver);  //switching tab -->we written code in WebDriverUtilies
		
		 Thread.sleep(2000);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		driverutilies.switchBack(driver);
		w.addtowishlist();
		
	}

}

