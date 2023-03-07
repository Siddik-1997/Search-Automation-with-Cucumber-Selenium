package StepDefinitions;

import Setup.Setup;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;

public class SearchStepDefinitions extends Setup {
    BasePage basePage;

    @Given("User visited the Github portal")
    public void user_visited_the_portal() {
        driver.get("https://github.com/");
    }

    @When("User search with {string}")
    public void do_Search_with_repo_name(String repoName) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.doSearch(repoName);
    }

    @Then("User verify with {string}")
    public void user_can_find_repository(String repoExpectName) {
        String repoActual = basePage.repoResult.get(8).getText();
        Assert.assertTrue(repoActual.contains(repoExpectName));
    }

    @And("User click on the About page")
    public void user_click_on_about() throws InterruptedException {
        basePage = new BasePage(driver);
        Thread.sleep(2000);
        basePage.doClick();
        Thread.sleep(3000);

        // Assertion
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
