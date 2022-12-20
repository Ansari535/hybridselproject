package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
@FindBy(xpath="//button[@aria-label=\"Play\"]")
private WebElement playbtn;

@FindBy(xpath="//button[@aria-label=\"Pause\"]")
private WebElement pausebtn;

@FindBy(xpath="//span[text()='Add To Wishlist']")
private WebElement addtowishlist;

@FindBy(xpath="//a[@class=\"close_cookies\"]")  //popup close
private WebElement closepopup;

//constructor
public WishlistPage(WebDriver driver) {	
	PageFactory.initElements(driver, this);
	
}
public void playbutton() {
	playbtn.click();
}
public void pausebutton() {
	pausebtn.click();
}
public void addtowishlist() {
	addtowishlist.click();
}
public void closepopup() {
	closepopup.click();
}
}
