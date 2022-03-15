package tests;

import helpers.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class TestPostPerson extends TestBase {

    @Test
    public void testPostCreatePerson() {
        init();
        String id = createPerson("Rafi3","Mirel3",44,200,"Ashdod","0505552123")
                .jsonPath()
                .getString("id");
        System.out.println(id);
        assertNotNull(id,"Person id is not null");
    }
}
