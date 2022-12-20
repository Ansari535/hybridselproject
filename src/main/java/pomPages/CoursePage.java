package pomPages;

//Lect 35-->1 prog
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CoursePage {
	@FindBy(id="Selenium Training") //inspect selenium training
	private WebElement seelenium;
	
	@FindBy(id="cartArea")   //drag and drop selenium training and inspect
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]") // scroll down and select linkedin
	private WebElement linkedin;
	
	//constructor
		public CoursePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	public WebElement getSeelenium() {
		return seelenium;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}
	public void linkedinicon() {
		linkedin.click();
	}

	
	
	

}
