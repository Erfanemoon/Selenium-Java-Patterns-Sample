import config.Selenium;
import model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Page;
import pages.SignUp;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JunitTest {
    private Selenium selenium;

    @BeforeEach
    public void initialize() {
        Page page = new SignUp();
        selenium = new Selenium(page);
    }

    @Test
    @DisplayName("sign up una nuova persona")
    public void signUp_test() {
        Person person = new Person("Eric", "Italy", "Genoa", "Ferguson");
        this.selenium.signUp(person);
        assertTrue(this.selenium.checkSignUp(), "user successfully signed up");
    }
}
