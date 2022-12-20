package genericLib;
//4 prog
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	public void getPhoto(WebDriver driver, String name) throws IOException {
		
		//create obj. for date and import from java.util package
		Date d=new Date();
		String currentdate = d.toString().replaceAll(":", "-");  //replace the date into this format
		
		//step 1: do type casting
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(AutoConstant.photoPath+currentdate+name+".png"); //photo in the only .png format
		FileUtils.copyFile(src, dest);
		
		
	}

	
}
