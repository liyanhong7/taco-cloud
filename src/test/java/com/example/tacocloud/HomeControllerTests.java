package com.example.tacocloud;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HomeController.class) // 针对HomeController的Web测试
public class HomeControllerTests {

    @Autowired
    private MockMvc mockMvc; // 注入MockMvc

    @Test
    void testHomePage() throws Exception {
        mockMvc.perform(get("/")) // 发起对"/"的GET
                .andExpect(status().isOk()) // 期望得到HTTP 200
                .andExpect(view().name("home")) // 期望得到home视图
                .andExpect(content().string( // 期望包含"Welcome to..."
                        containsString("Welcome to...")));
    }
}
