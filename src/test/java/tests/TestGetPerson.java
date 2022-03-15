package tests;

import helpers.TestBase;
import model.Person;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

public class TestGetPerson extends TestBase {

    @Test
    public void testGetPerson() {
        init();
        List<Person> personList = personServiceHelper.getAllPerson();
        assertNotNull(personList, "Person List Is Not Empty");
        assertFalse(personList.isEmpty(), "Person List Is not True");
    }
}
