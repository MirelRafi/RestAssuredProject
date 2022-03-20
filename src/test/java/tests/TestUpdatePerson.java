package tests;

import helpers.TestBase;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class TestUpdatePerson extends TestBase {

    @Test
    @Description("Update person details and verify status code")
    @Epic("EP004")
    @Feature("Feature4: Update person details")
    @Story("Story: Person details update")
    @Severity(SeverityLevel.TRIVIAL)
    public void updatePerson() {
        init();
        updatePerson("Update1","Test",40,9,"NewAddress1","0502120010");
    }
}
