package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UnitedAirlinesHomePage {


    public UnitedAirlinesHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(css = "div[role='tablist'] a")
        public List<WebElement> mainMenuNavigationItems;

        @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] li")
        public List<WebElement> travelNavMenuItems;

        @FindBy(css = "div[class='app-components-BookFlightForm-bookFlightForm__radioContainer--3WXQM'] label")
        public List<WebElement> roundAndOneWayTripRadioButtons;

        @FindBy(id = "roundtrip")
        public WebElement roundTripRadioButton;

        @FindBy(id = "oneway")
        public WebElement oneWayRadioButton;

        @FindBy(css = "label[for='award']")
        public WebElement bookWithMilesCheckBox;

        @FindBy(css = "label[for='flexibleDates']")
        public WebElement flexibleDatesCheckBox;

        @FindBy(id = "bookFlightOriginInput")
        public WebElement fromInputBox;

        @FindBy(id = "bookFlightDestinationInput")
        public WebElement toInputBox;

        @FindBy(css = "svg[class*='SingleDatePickerInput_clearDate_svg']")
        public WebElement clearDate;

        @FindBy(id = "DepartDate")
        public WebElement departureDate;

        @FindBy(id = "passengerSelector")
        public WebElement passengerSelector;

        @FindBy(css = "button[aria-label='Substract one Adult']")
        public WebElement additionalTraveler;

        @FindBy(id = "cabinType")
        public WebElement cabinOption;

        @FindBy(css = "ul[role='listbox']>li")
        public List<WebElement> cabinType;

        @FindBy(css = "button[type='submit']")
        public WebElement findFlightButton;






}
