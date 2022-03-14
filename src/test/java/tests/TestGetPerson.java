package tests;

import helpers.PersonServiceHelper;
import model.Person;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

public class TestGetPerson {

    private PersonServiceHelper personServiceHelper;

    @BeforeClass
    public void init() {
        personServiceHelper = new PersonServiceHelper();

    }

    @Test
    public void testGetPerson() {
        List<Person> personList = personServiceHelper.getAllPerson();
        assertNotNull(personList,"Person List Is Not Empty");
        assertFalse(personList.isEmpty(),"Person List Is not True");
    }
}
