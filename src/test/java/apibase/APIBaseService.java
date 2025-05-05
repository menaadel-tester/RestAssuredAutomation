package apibase;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class APIBaseService {

    private static final String Base_URL = "https://661668c0b8b8e32ffc7d6507.mockapi.io";

    private final RequestSpecification requestSpecification ;


    public APIBaseService(){

        requestSpecification = given().baseUri(Base_URL);
    }


    protected Response getRequest( String endpoint){


        return requestSpecification.contentType(ContentType.JSON)

                .accept(ContentType.JSON)
                .log().all()
                .get(endpoint)
                .then()
                .extract().response();























    }








}
