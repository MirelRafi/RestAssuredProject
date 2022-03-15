package helpers;

import org.testng.annotations.BeforeClass;

public class TestBase extends PersonServiceHelper {

    public PersonServiceHelper personServiceHelper;

    @BeforeClass
    public void init() {
        personServiceHelper = new PersonServiceHelper();
    }

}
