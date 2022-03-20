package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;

public class BddStyleMethod {

    public static void SimpleGetPersonList() {
        given().contentType(ContentType.JSON)
                .when().get("http://localhost:3000/persons")
                .then().body("firstName", containsInAnyOrder("Amit", "John", "Update1", "Rafi", "Rafi3", "Rafi7"));
    }
}
