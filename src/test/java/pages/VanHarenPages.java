package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VanHarenPages {
    public VanHarenPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Pop-up close
    @FindBy(css = ".message-pipe.primary")
    public WebElement popup_close;


    //Heren Button
    @FindBy(xpath = "((//*[text()=' Heren ' ])[1])")
    public WebElement heren_button;


    //Sale Alles button
    @FindBy(xpath = "(//img[@alt='vH_default_sale alles 75_1280x400.jpg'])")
    public WebElement salealles_button;


    //Filter button
    @FindBy(css = "div#anchor_productGrid span.desktop-filter.message-pipe")
    public WebElement filter_button;


    //Size button
    @FindBy(xpath = "(//span[normalize-space()='Maat'])")
    public WebElement maat_button;

    //Select size button
    @FindBy(xpath = "(//label[@for='list-facet-sizeEU-42.0'])")
    public WebElement maat_select;


    //Gender button
    @FindBy(xpath = "(//span[normalize-space()='Gesclacht'])")
    public WebElement gender_button;


    //Apply button
    @FindBy(xpath = "((//span[@data-value='toepassen'])[1])")
    public WebElement toepassen_button;

    //Show results button
    @FindBy(css = "div#anchor_productGrid form > label")
    public WebElement resultatentonen_button;


}
