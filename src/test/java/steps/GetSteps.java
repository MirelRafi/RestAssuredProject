package steps;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

public class GetSteps {
    @Given("I perform GET operation for persons list")
    public void iPerformGETOperationForPersonsList() {
    }

    @io.cucumber.java.en.When("I perform GET for all persons")
    public void iPerformGETForAllPersons() {
        BddStyleMethod.SimpleGetPersonList();
    }

    @io.cucumber.java.en.Then("I should see the first name as {string}")
    public void iShouldSeeTheFirstNameAs(String arg0) {
    }


}
