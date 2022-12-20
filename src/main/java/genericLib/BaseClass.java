package genericLib;
//3 prog.
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
public PropertyFilleData pdata= new PropertyFilleData();
public WebDriverUtilies driverutilies=new WebDriverUtilies(); //Lect. 34 1:17 in video --> create obj. 1 time and call it 


@BeforeMethod
public void openApp() throws IOException {
	WebDriverManager.chromedriver().setup(); //Lect. 34 --> 1:19 in video
	// WebDriverManager.firefoxdriver(); ////Lect. 34 --> 1:19 in video
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getData("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@AfterMethod
public void closApp() {
	driver.quit();
}

}
