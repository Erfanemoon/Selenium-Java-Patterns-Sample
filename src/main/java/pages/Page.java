package pages;

import model.Person;
import org.openqa.selenium.WebDriver;

public interface Page {

    void signUp(Person person);
    void connect(String url);
    boolean checkSignUp();
    WebDriver initializeDriver();
}
