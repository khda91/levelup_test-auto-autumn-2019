package ru.level.qa.test.auto.autumn.cucumber.steps;

import cucumber.api.java.en.Then;
import ru.level.qa.test.auto.autumn.cucumber.TestContext;
import ru.level.qa.test.auto.autumn.cucumber.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;

public class ThenSteps {

    @Then("Created user should be first in the user table on the Main page")
    public void createdUserShouldBeFirstOnTheMainPage() {
        HomePage hp = new HomePage(TestContext.getDriver());
        String actualUserEmailFromTable = hp.getUserEmailFromTable(0);
        String expected = TestContext.getTestData("user_email");
        assertThat(actualUserEmailFromTable, containsStringIgnoringCase(expected+"ajbcascas"));
    }
}
