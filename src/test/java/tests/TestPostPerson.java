package tests;

import helpers.TestBase;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class TestPostPerson extends TestBase {

    @Test
    @Description("Create new person and verify id is not null")
    @Epic("EP002")
    @Feature("Feature2: Get person details")
    @Story("Story: Create person")
    @Severity(SeverityLevel.NORMAL)
    public void testPostCreatePerson() {
        init();
        String id = createPerson("Rafi7","Mirel7",50,201,"Ashdod1","0505552124")
                .jsonPath()
                .getString("id");
        System.out.println(id);
        assertNotNull(id,"Person id is not null");
    }
}
