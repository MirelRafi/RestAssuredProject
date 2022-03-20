package helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import constants.EndPoints;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Person;
import org.apache.http.HttpStatus;
import utils.ConfigManager;

import java.lang.reflect.Type;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PersonServiceHelper {

    // We need to read the config variables - Rest Assured about URL and port
    // Make a GET Request on this URL and send the data to TestGetPerson
    private static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
    private static final String PORT = ConfigManager.getInstance().getString("port");

    public PersonServiceHelper() {
        baseURI = BASE_URL;
        port = Integer.parseInt(PORT);
        useRelaxedHTTPSValidation();
    }

    public List<Person> getAllPerson() {
        Response response =
                given()
                        .log().all()
                        .contentType(ContentType.JSON)
                        .get(EndPoints.GET_ALL_PERSON)
                        .andReturn();
        Type type = new TypeReference<List<Person>>() {
        }.getType();

        assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "OK");

        List<Person> personList = response.as(type);
        response.prettyPrint();
        System.out.println("Status code: " + response.getStatusCode());

        return personList;
    }

    public Response createPerson(String firstName, String lastName, Integer age, Integer id, String address, String phoneNumbers) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setId(id);
        person.setAddress(address);
        person.setPhoneNumbers(phoneNumbers);

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .when()
                        .body(person)
                        .post(EndPoints.CREATE_PERSON)
                        .andReturn();

        assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED, "Created");
        System.out.println("Status code: " + response.getStatusCode());
        response.prettyPrint();

        return response;
    }

    public Response updatePerson(String firstName, String lastName, Integer age, Integer id, String address, String phoneNumbers) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setId(id);
        person.setAddress(address);
        person.setPhoneNumbers(phoneNumbers);

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .pathParam("id", id)
                        .when()
                        .body(person)
                        .patch(EndPoints.UPDATE_PERSON)
                        .andReturn();

        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        System.out.println("Status code: " + response.getStatusCode());
        response.prettyPrint();

        return response;
    }

    public Response deletePerson(Integer id) {

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .pathParam("id", id)
                        .log().all()
                        .when()
                        .delete(EndPoints.DELETE_PERSON)
                        .andReturn();
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        System.out.println("Status code: " + response.getStatusCode());
        response.prettyPrint();

        return response;
    }
}
