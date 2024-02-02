package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VanHarenPages {
    public VanHarenPages() { PageFactory.initElements(Driver.getDriver(), this);}

    //Pop-up close
    @FindBy(css = ".message-pipe.primary")
    public WebElement popupclose;

    //Filter button
    @FindBy(css = "div#anchor_productGrid span.desktop-filter.message-pipe")
    public WebElement filter_button;

    //Gender button- Male
    @FindBy(xpath = "((//img[@alt='Van haren Sale'])[3])")
    public WebElement heren_button;


    //Size button
    @FindBy(xpath = "(//span[normalize-space()='Maat'])")
    public WebElement maat_button;

    //Select size button
    @FindBy(xpath = "(//label[@for='list-facet-sizeEU-42.0'])")
    public WebElement maat_select;

    //Apply button
    @FindBy(xpath = "((//span[@data-value='toepassen'])[1])")
    public WebElement toepassen_button;

   //Show results button
    @FindBy(css ="div#anchor_productGrid form > label" )
    public WebElement resultatentonen_button;


}
