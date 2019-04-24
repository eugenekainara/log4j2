package com.example.log4j.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @GetMapping(path = "/info")
    public String getInfo(){
        String response = "some info";
        logger.info(response);
        return response;
    }
    @GetMapping(path = "/exception")
    public String getException(){
        Exception ex = new Exception("An error occured");
        logger.error(ex);
        return ex.getMessage();
    }
}
