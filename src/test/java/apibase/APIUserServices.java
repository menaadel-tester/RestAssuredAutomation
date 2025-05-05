package apibase;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class APIUserServices extends APIBaseService{

    private static final String Base_Path = "/api/v1/" ;

    public Response users(){

        return getRequest(Base_Path+"users");


    }









}
