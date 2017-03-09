package com.bhn.exercise1.controller;

import com.bhn.exercise1.rest.ApiResponse;
import com.bhn.exercise1.service.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by djeremias on 3/7/17.
 */
@RestController
@RequestMapping(value = "/foo")
public class FooController {

    private final static Logger LOG = LoggerFactory.getLogger(FooController.class);

    private final FooService fooService;

    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @RequestMapping(value = "/bar", method = RequestMethod.GET)
    public ResponseEntity<String> barAction() {
        LOG.info("returning String payload for api request to barAction()");

        return new ResponseEntity<>(fooService.getBarString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/bar/json", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<String>> barActionJson() {
        ApiResponse<String> apiResponse = new ApiResponse<>(fooService.getBarJson());
        LOG.info("returning payload for api request to barActionJson()");

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
