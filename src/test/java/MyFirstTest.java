import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by cyndi.russell on 5/4/16.
 */
public class MyFirstTest {

    @Test
    public void goToWebPage(){

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.mozilla.org/en-US/firefox/45.0.2/firstrun/learnmore/");
        assertTrue(driver.getTitle().equals("en-US"));

        driver.quit();
    }


    }

