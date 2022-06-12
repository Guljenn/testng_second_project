package unitedAirlinesTest;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UnitedAirlinesMainMenuTest extends Base {


    @Test(priority = 1, description = "Validate \"Main menu\" navigation items")
    public void validateMainMenuItems() {
        driver.get("https://www.united.com/en/us");

        for (int i = 0; i < 6; i++) {
            Assert.assertTrue(unitedAirlinesHomePage.mainMenuNavigationItems.get(i).isDisplayed());


        }
    }


    @Test(priority = 2, description = "Validate \"Book travel menu\" navigation items")
    public void validateBookTravelNavItems() {
        driver.get("https://www.united.com/en/us");

        String[] travelNavMenuItems = {"Book", "Flight status", "Check-in", "My trips"};

        for (int i = 0; i < travelNavMenuItems.length; i++) {
            Assert.assertTrue(unitedAirlinesHomePage.travelNavMenuItems.get(i).isDisplayed());
            Assert.assertEquals(unitedAirlinesHomePage.travelNavMenuItems.get(i).getText(), travelNavMenuItems[i]);

        }
    }


    @Test(priority = 3, description = "Validate \"Round-trip\" and \"One-way\" radio buttons")
    public void validateRadioButtons() {
        driver.get("https://www.united.com/en/us");


        for (WebElement element : unitedAirlinesHomePage.roundAndOneWayTripRadioButtons) {
            Assert.assertTrue(element.isDisplayed() & element.isEnabled());

        }
        Assert.assertTrue(unitedAirlinesHomePage.roundTripRadioButton.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.oneWayRadioButton.isSelected());

        unitedAirlinesHomePage.oneWayRadioButton.click();
        Assert.assertTrue(unitedAirlinesHomePage.oneWayRadioButton.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.roundTripRadioButton.isSelected());

    }


    @Test(priority = 4, description = "Validate \"Book with miles\" and \"Flexible dates\" checkboxes")
    public void validateCheckBoxes() {
        driver.get("https://www.united.com/en/us");

        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesCheckBox.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesCheckBox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckBox.isSelected());

        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesCheckBox.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesCheckBox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckBox.isSelected());

        unitedAirlinesHomePage.bookWithMilesCheckBox.click();
        unitedAirlinesHomePage.flexibleDatesCheckBox.click();
        unitedAirlinesHomePage.bookWithMilesCheckBox.click();
        unitedAirlinesHomePage.flexibleDatesCheckBox.click();

        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckBox.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckBox.isSelected());

    }

    @Test(priority = 5, description = "Validate One-way ticket search results from Chicago to Miami")
    public void validateSearchResults(){
        driver.get("https://www.united.com/en/us");

        unitedAirlinesHomePage.oneWayRadioButton.click();
        unitedAirlinesHomePage.fromInputBox.sendKeys("Chicago, IL, US (ORD)");
        unitedAirlinesHomePage.toInputBox.sendKeys("Miami, FL, US (MIA)");
        unitedAirlinesHomePage.departureDate.click();
        unitedAirlinesHomePage.clearDate.click();
        unitedAirlinesHomePage.departureDate.sendKeys("Jan 30");
        unitedAirlinesHomePage.passengerSelector.click();
        unitedAirlinesHomePage.additionalTraveler.click();
        unitedAirlinesHomePage.cabinOption.click();
        unitedAirlinesHomePage.cabinType.get(2).click();
        unitedAirlinesHomePage.findFlightButton.click();
        driver.navigate().to("https://www.united.com/en/us/fsr/choose-flights?f=ORD&t=MIAMI%2C%20FL%2C%20US%20(MIA%20-%20ALL%20AIRPORTS)&d=2022-08-12&tt=1&sc=7&ct=1&px=2%2C0%2C0%2C0%2C0%2C0%2C0%2C0&taxng=1&newHP=True&clm=7&st=bestmatches");
        Assert.assertEquals(departurePage.departureMessage.getText(), "Depart: Chicago, IL, US to Miami, FL, US");




    }


    }








