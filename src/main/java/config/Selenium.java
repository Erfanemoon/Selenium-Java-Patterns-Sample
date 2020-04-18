package config;

import config.common.ConfigReader;
import model.Person;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pages.Page;
import pages.SignUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Selenium {
    Page page;

    public Selenium(Page page) {
        this.page = page;
    }

    public void signUp(Person person) {
        page.signUp(person);
    }

    public boolean checkSignUp() {
        return page.checkSignUp();
    }

}
