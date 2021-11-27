package Utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;

public class APITest {
    @Test
    public void testGetAPI()
    {
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        request.baseUri("https://reqres.in/api/users/1");
        Response response = request.get();
        System.out.println("Response is: " + response.asString());
        ValidatableResponse results = response.then();
        results.statusLine("HTTP/1.1 200 OK");
        results.statusCode(200);
        results.body("data.first_name", containsString("George"));

    }
    @Test
    public void testGetBDDWay()
    {
        RestAssured.given().relaxedHTTPSValidation()
                .baseUri("https://reqres.in/api/users/1")
                .get()
                .then()
                .statusCode(200)
                .body("data.first_name", containsString("George"));
    }
}
