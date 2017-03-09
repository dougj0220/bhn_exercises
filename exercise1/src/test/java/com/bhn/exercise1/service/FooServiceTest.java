package com.bhn.exercise1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * Created by djeremias on 3/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FooServiceTest {

    @Autowired
    private FooService fooService;

    @Test
    public void testGetBarString() {
        String ret = fooService.getBarString();
        Assert.isTrue(ret != null, "null check assertion");
        Assert.isTrue(ret.equals("Hello Foo Bar String!!"), "expected String assertion");
    }

    @Test
    public void testGetBarJson() {
        String ret = fooService.getBarJson();
        Assert.isTrue(ret != null, "null check assertion");
        Assert.isTrue(ret.equals("Hello Foo Bar Json"), "expected String assertion");
    }

}
