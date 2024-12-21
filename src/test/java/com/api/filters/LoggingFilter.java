package com.api.filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {
    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);
    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        logRequest(requestSpec);
        Response response = ctx.next(requestSpec,responseSpec);
        logResponse(response);
        return response;
    }
    public void logRequest(FilterableRequestSpecification request){
        logger.info("BASE URI : " + request.getBaseUri());
        logger.info("Request Headers are  : " + request.getHeaders());
        logger.info("Request Payload : " + request.getBody());
    }
    public void logResponse(Response response){
        logger.info("BASE URI : " + response.getStatusCode());
        logger.info("Response Headers are  : " + response.getHeaders());
        logger.info("Response Body : " + response.getBody().prettyPrint());
    }
}
