package tests;

import helpers.TestBase;
import org.testng.annotations.Test;

public class TestDeletePerson extends TestBase {

    @Test
    public void deletePerson() {
        init();
        deletePerson(1);
    }
}
