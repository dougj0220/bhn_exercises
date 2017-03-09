package com.bhn.exercise1.controller;

import com.bhn.exercise1.service.FooService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by djeremias on 3/7/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = FooController.class)
public class FooControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FooService fooService;

    @Test
    public void testBarAction() throws Exception {
        given(this.fooService.getBarString())
                .willReturn("Hello Foo Bar String!!");
        mvc.perform(MockMvcRequestBuilders.get("/foo/bar").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello Foo Bar String!!")));
    }

    @Test
    public void testBarActionJson() throws Exception {
        given(this.fooService.getBarJson())
                .willReturn("Hello Foo Bar Json");
        mvc.perform(MockMvcRequestBuilders.get("/foo/bar/json").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"message\": null,\"payload\": \"Hello Foo Bar Json\"}"));
    }
}
