package com.worldinfo.controller;

import com.worldinfo.constant.ErrorCode;
import com.worldinfo.model.Country;
import com.worldinfo.model.CountryLanguage;
import com.worldinfo.service.CountryService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = CountryController.class)
public class CountryControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CountryService service;

    @Test
    public void testReturnErrorIfCountryCodeDoesnotExist() throws Exception {
        String code = "EGY";

        JSONObject expectedContent = new JSONObject();
        expectedContent.put("message", ErrorCode.INVALID_COUNTRY_CODE);

        given(service.getCountry(code)).willReturn(null);

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/" + code)
                .contentType(MediaType.APPLICATION_JSON);

        mvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isInternalServerError())
                .andExpect(MockMvcResultMatchers.content().json(expectedContent.toString()));
    }
}
