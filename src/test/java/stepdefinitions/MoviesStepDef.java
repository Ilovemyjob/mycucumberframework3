package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class MoviesStepDef {
    Response response;
    @Given("the user set uri")
    public void the_user_set_uri() {
        baseURI= ConfigReader.getProperty("rakuten_uri");//we did option + enter to make static
    }

    @Given("the user sends post request with {string} end point")
    public void the_user_sends_post_request_with_end_point(String endpoint,Map<String ,Object> data2) {

        Map<String ,Object> data = new HashMap<>();
        data.put("title" , "Salamanca 2");
        data.put("year" , 2000);
        data.put("plot" , "MrtFth");
        data.put("duration" ,123);
        data.put("audio_qualities" , "");
        data.put("video_qualities" , "");
        data.put("genres" , "");



        response = given().accept(ContentType.JSON).contentType(ContentType.JSON).when().body(data2).post(endpoint);

        // to make dynamic
        response.prettyPrint();
    }

    @When("Verify the status code is {int}")
    public void verify_the_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());

    }

    @When("Verify the content type is {string}")
    public void verify_the_content_type_is(String contentType) {
        Assert.assertEquals(contentType,response.contentType());
    }

    @Then("print the response body")
    public void print_the_response_body() {

        response.prettyPrint();
    }

    @Given("the user sends get request with {string} end point {int}")
    public void the_user_sends_get_request_with_end_point(String endpoint, int id) {
        response=given().accept(ContentType.JSON).pathParam("id",id).when().get(endpoint+"/{id}");
        response.prettyPrint();
    }

    @Then("Verify the response body is equal which is you posted")
    public void verify_the_response_body_is_equal_which_is_you_posted() {

        Map<String ,Object> data = new HashMap<>();
        data.put("id" , 1459);
        data.put("title" , "Salamanca 2");
        data.put("year" , 2000);
        data.put("plot" , "MrtFth");
        data.put("duration" ,123);
        data.put("audio_qualities" , "");
        data.put("video_qualities" , "");
        data.put("genres" , "");

//        JsonPath json = response.jsonPath();
//        Assert.assertEquals(data.get("id"),json.getInt("id"));
//        Assert.assertEquals(data.get("plot"),json.getString("plot"));

        System.out.println(response.path("id").toString());
        System.out.println(response.path("title").toString());

        Assert.assertEquals(data.get("year"),response.path("year"));

    }


    @Given("the user sends put request with {string} end point")
    public void the_user_sends_put_request_with_end_point(String endpoint,Map<String ,Object> data ) {

        response=given().accept(ContentType.JSON).when().body(data).put(endpoint + "/1459");
    }

    @Then("Verify the response body is updated")
    public void verify_the_response_body_is_updated() {
        Map<String ,Object> data = new HashMap<>();
        data.put("id" , 1459);
        data.put("title" , "Salamanca 2");
        data.put("year" , 2000);
        data.put("plot" , "MrtFth");
        data.put("duration" ,123);
        data.put("audio_qualities" , "");
        data.put("video_qualities" , "");
        data.put("genres" , "");
        response = given().get("/movies/1459");

        Assert.assertEquals(data.get("title"),response.path("title"));
    }





}
