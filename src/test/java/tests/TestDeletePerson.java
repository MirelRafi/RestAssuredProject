package tests;

import helpers.TestBase;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class TestDeletePerson extends TestBase {

    @Test
    @Description("Delete person details and verify status code")
    @Epic("EP003")
    @Feature("Feature3: Delete person details")
    @Story("Story: Person details deletion")
    @Severity(SeverityLevel.MINOR)
    public void deletePerson() {
        init();
        deletePerson(7);
    }
}
