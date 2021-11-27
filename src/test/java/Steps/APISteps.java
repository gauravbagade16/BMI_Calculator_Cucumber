package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.Matchers.containsString;

public class APISteps {
    Response response;

    @When("I send a {string} request with {string} endpoint")
    public void iSendARequestWithEndpoint(String method, String uri) {
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        request.baseUri("https://reqres.in/api"+uri);
        if(method.equals(method))
         response = request.get();
    }

    @Then("I verify the response contains following information:")
    public void iVerifyTheResponseContainsFollowingInformation(DataTable table) {
        System.out.println("Response is: " + response.asString());
        ValidatableResponse results = response.then();
        results.statusLine("HTTP/1.1 200 OK");
        results.statusCode(200);

        List<List<String>> data = table.asLists();
        System.out.println(data.get(1).get(1));

        System.out.println(data.get(1).get(2));
        System.out.println(data.get(1).get(3));
        results.body("data.first_name",Matchers.is("George"));
                //("data.first_name", Matchers.is("George"));
       // results.body("data.first_name", containsString(data.get(1).get(3)));

    }








}
