package pages;

import config.Selenium;
import config.common.ConfigReader;
import model.Person;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUp extends PageAdapter {

    @FindBy(how = How.ID, using = "firstname")
    private WebElement name_element;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastName_element;

    @FindBy(how = How.ID, using = "address")
    private WebElement address_element;

    @FindBy(how = How.ID, using = "zipcode")
    @CacheLookup
    private WebElement zip_code_element;

    @FindBy(how = How.ID, using = "signup")
    private WebElement submit;

    private By title_element = By.xpath("/html/body/h1");

    @Override
    public void signUp(Person person) {
        connect(ConfigReader.getConfig().getString("sign_up.url"));
        //  clearElement(this.name_element, this.lastName_element, this.address_element, this.zip_code_element);
        this.name_element.sendKeys(person.getName());
        this.lastName_element.sendKeys(person.getLastName());
        this.address_element.sendKeys(person.getAddress());
        this.zip_code_element.sendKeys(person.getZip_code());
        submit.click();
    }

    private void clearElement(WebElement... elements) {
        for (WebElement element : elements)
            element.clear();
    }

    @Override
    public boolean checkSignUp() {
        String title = webDriver.findElement(title_element).getText();

        return title.equalsIgnoreCase("Thank you!");
    }
}
