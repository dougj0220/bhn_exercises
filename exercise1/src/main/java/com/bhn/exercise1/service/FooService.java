package com.bhn.exercise1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by djeremias on 3/7/17.
 */
@Service
public class FooService {

    private final static Logger LOG = LoggerFactory.getLogger(FooService.class);

    @Value("${foo.bar}")
    private String fooString;

    public String getBarString() {
        LOG.info("entering into getBarString() service method");
        return fooString;
    }

    public String getBarJson() {
        LOG.info("entering into getBarJson() service method");
        return "Hello Foo Bar Json";
    }
}
