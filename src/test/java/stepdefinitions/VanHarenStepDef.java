package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.VanHarenPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class VanHarenStepDef {

    VanHarenPages pages;


    @Given("go to van Haren")
    public void go_to_van_haren() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    @Then("close pop up")
    public void closePopUp() {
        pages = new VanHarenPages();
        pages.popup_close.click();
    }

    @Then("click Heren")
    public void clickHeren() {
        pages = new VanHarenPages();
        ReusableMethods.justwait(3);
        pages.heren_button.click();
    }
    @Then("click Sale Alles")
    public void clickSaleAlles() {
        pages = new VanHarenPages();
        pages.salealles_button.click();
    }
    @Then("click filter")
    public void clickFilter() {
        pages = new VanHarenPages();
        ReusableMethods.justwait(1);
        ReusableMethods.scrolldown_600();
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
        ReusableMethods.scrolldown_slowly();


    }

    @And("terminate test")
    public void terminateTest() {
        ReusableMethods.justwait(2);
        Driver.closeDriver();
        Driver.quitDriver();
    }



}
