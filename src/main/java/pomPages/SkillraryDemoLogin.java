package pomPages;
//Lect. 34 --2 prog.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SkillraryDemoLogin {
	@FindBy(id="course")
	private WebElement coursetab; //mousehover on course
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraning; //click on selenium training
	
	//class 35
	@FindBy(name="addresstype")
	private WebElement coursedd; //course dropdown
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	//create a constructor
	public SkillraryDemoLogin(WebDriver driver) {   //constructor name same as class name
		PageFactory.initElements(driver, this);
	}
    
	//create getters method for mousehover
	public WebElement getCoursetab() {
		return coursetab;
	}
	// create a normal method for clicking on seleniumtraning 
	public void selenium() {
	seleniumtraning.click();
	}

}
