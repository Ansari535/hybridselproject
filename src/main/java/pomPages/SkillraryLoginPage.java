package pomPages;
//Lect. 34 --1 prog.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;  // gearsbtn -- declare in method
	 
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]") //click on skillrary demo app
	private WebElement demoapp;  // demoapp-- declare in method
	
	//Lect 35
	@FindBy(name="q")
	private WebElement searchtb;
	
	//Lect 35
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//create a constructor
	public SkillraryLoginPage(WebDriver driver) {  //constructor name same as class name
		PageFactory.initElements(driver, this);
	}
	
	//create methods for click 
	public void gearsButton() {
		gearsbtn.click();  //from line 11 --> gearsbtn
	}
	
	public void skillrarydemoapp() {
		demoapp.click(); //from line 14 -->demoapp
	}
	public void searchtextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void searchbutton() {
		searchbtn.click();
	}
	
	
}
