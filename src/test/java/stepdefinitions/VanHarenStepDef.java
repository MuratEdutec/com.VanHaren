package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.VanHarenPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;


public class VanHarenStepDef {

    VanHarenPages pages;


    @Given("go to van Haren")
    public void go_to_van_haren() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    @Then("close pop up")
    public void closePopUp() {
        pages = new VanHarenPages();
        pages.popupclose.click();
    }


    @Then("click Heren Sale")
    public void clickHerenSale() {
        pages = new VanHarenPages();
        ReusableMethod.justwait(1);
        pages.heren_button.click();
    }


    @Then("click filter")
    public void clickFilter() {
        pages = new VanHarenPages();
        ReusableMethod.justwait(1);
        pages.filter_button.click();

    }

    @Then("click maat and select maat {int}")
    public void clickMaatAndSelectMaat(int arg0) {
        pages = new VanHarenPages();
        pages.maat_button.click();
        pages.maat_select.click();
    }


    @Then("click toepassen")
    public void clickToepassen() {
        pages = new VanHarenPages();
        pages.toepassen_button.click();
    }


    @Then("click resultaten tonen")
    public void clickResultatenTonen() {
        pages = new VanHarenPages();
        pages.resultatentonen_button.click();
        ReusableMethod.scrolldown_slowly();


    }

    @And("terminate test")
    public void terminateTest() {
        ReusableMethod.justwait(2);
        Driver.closeDriver();
        Driver.quitDriver();
    }
}