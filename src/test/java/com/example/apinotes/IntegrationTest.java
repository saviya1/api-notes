package com.example.apinotes;
import org.apache.commons.lang3.Range;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.apinotes.controller.noteController;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;


public class IntegrationTest {
    private MockMvc mockMvc;


    @Test
    public void IntegrationTest() {
        mockMvc.perform(get("/note")).andExpect(status().isOk());
    }


}