package apitest;

import apibase.APIBaseService;
import apibase.APIUserServices;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;

public class APIUserTest {

    @Test

    public void testGetAllUsers() {

        APIUserServices apiUserServices = new APIUserServices();
        Response response = apiUserServices.users();
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

    }


@Test
    public void testSpecificName(){

        APIUserServices apiUserServices = new APIUserServices();
        Response response = apiUserServices.users();
        System.out.println(response.asPrettyString());
        List<String> names = response.jsonPath().getList("name");
        Assert.assertTrue(names.contains("Jessica Kling"));
        String name = response.jsonPath().getString("[1].name");
        Assert.assertEquals(name,"Jessica Kling");
        // use matchers
        response.then().body("[1].name", not("Ahmed"));
        response.then().body("[1].name",equalTo("Jessica Kling"));



}

}


