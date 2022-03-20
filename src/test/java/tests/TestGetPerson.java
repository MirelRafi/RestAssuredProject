package tests;

import helpers.TestBase;
import io.qameta.allure.*;
import model.Person;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class TestGetPerson extends TestBase {

    @Test
    @Description("Get list of all persons and verify list is not null")
    @Epic("EP001")
    @Feature("Feature1: Get person details")
    @Story("Story: Person details presence")
    @Severity(SeverityLevel.CRITICAL)
    public void testGetPerson() {
        init();
        List<Person> personList = personServiceHelper.getAllPerson();
        assertNotNull(personList, "Person List Is Not Empty");
        assertFalse(personList.isEmpty(), "Person List Is not True");
    }
}
