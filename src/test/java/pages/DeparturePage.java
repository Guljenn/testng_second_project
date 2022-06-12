package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeparturePage {

    public DeparturePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='app-components-Shopping-TripInfo-styles__tripOriginDestinationHeader--RcPyp']")
    public WebElement departureMessage;

}
