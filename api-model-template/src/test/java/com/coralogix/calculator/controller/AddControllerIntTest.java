package com.coralogix.calculator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.coralogix.calculator.services.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class AddControllerIntTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private AddService addService;

  @Test
  void shouldSumTwoNumberAndResponseHttpStatusCode200() throws Exception {
    mockMvc.perform(get("/add/1/2")
            .contentType("application/json") )
        .andExpect(status().isOk())
        .andExpect(content().json("{\"result\":3}"))
        ;
  }

}