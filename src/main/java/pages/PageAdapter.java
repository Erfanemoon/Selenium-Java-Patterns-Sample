package pages;

import config.Selenium;
import model.Person;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class PageAdapter implements Page {
    protected WebDriver webDriver;

    public PageAdapter() {
        webDriver = initializeDriver();
        PageFactory.initElements(webDriver, this);
    }

    @Override
    public void signUp(Person person) {
    }

    @Override
    public void connect(String url) {
        webDriver.navigate().to(url);
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Override
    public abstract boolean checkSignUp();

    @Override
    public WebDriver initializeDriver() {
        File directory = new File("./geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", directory.getPath());
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        return new FirefoxDriver(capabilities);
    }

}
