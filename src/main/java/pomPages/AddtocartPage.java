package pomPages;
//Lect. 34 --3 prog.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class AddtocartPage {
   @FindBy(id="add")  //click on + button
   private WebElement addbutton; //double click on + button--> getters method
 
    @FindBy(xpath="//button[text()=\" Add to Cart\"]") //add to cart
    private WebElement addtocartbtn; // normal click  create normal method
 
    //create a constructor
	public AddtocartPage(WebDriver driver) { //constructor name same as class name
		PageFactory.initElements(driver, this);
	}
    // create getters method for double click
	public WebElement getAddbutton() {
		return addbutton;
	}
	//normal method for click
	public void addtocartbtn() {
		addtocartbtn.click();
	}
    
}
