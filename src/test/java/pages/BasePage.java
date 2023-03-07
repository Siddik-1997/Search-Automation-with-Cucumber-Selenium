package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    @FindBy(className = "form-control")
    public List<WebElement> txtSearch;

    @FindBy(className = "v-align-middle")
    public List<WebElement> repoResult;
    @FindBy(tagName = "a")
    public List<WebElement> btnClick;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doSearch(String repoName) throws InterruptedException {
        txtSearch.get(1).sendKeys(repoName);
        Thread.sleep(1000);
        txtSearch.get(1).sendKeys(Keys.ENTER);

    }

    public void doClick() {
        btnClick.get(186).click();
    }

}
