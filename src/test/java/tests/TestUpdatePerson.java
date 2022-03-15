package tests;

import helpers.TestBase;
import org.testng.annotations.Test;

public class TestUpdatePerson extends TestBase {

    @Test
    public void updatePerson() {
        init();
        updatePerson("Update","Works",40,9,"NewAddress","0502120011");
    }
}
