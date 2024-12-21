package com.api.base;

import com.api.models.request.LoginPayload;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;

public class BaseService {
    private static final String BASE_URI = "http://64.227.160.186:8080";
    private final RequestSpecification requestSpecification;
    private static final Logger logger = LogManager.getLogger(BaseService.class);
    public BaseService(){
        requestSpecification = given().baseUri(BASE_URI).filters(new RequestLoggingFilter(),new ResponseLoggingFilter());
    }
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).log().all().when().post(endpoint);
    }
    protected Response getRequest(String endpoint){
        return requestSpecification.when().get(endpoint);
    }
    protected void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer " + token);
    }
    protected Response putRequest(Object payload,String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).when().put(endpoint);
    }

}
