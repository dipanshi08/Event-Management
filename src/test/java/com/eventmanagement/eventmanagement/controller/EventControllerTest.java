package com.eventmanagement.eventmanagement.controller;

import com.eventmanagement.eventmanagement.entity.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class EventControllerTest {

    private MockMvc mockMvc;

    private EventController eventController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(eventController).build();
    }
//
//    @Test
//    void addEvent() {
//    }
//
//    @Test
//    void addEvents() {
//    }
//
//    @Test
//    void findAllEvents() {
//    }

    @Test
    void findEventById() throws Exception {

        mockMvc.perform(get("/api/eventById/1"))
                .andExpect(status().isOk());

    }

//    @Test
//    void findEventByTitle() {
//    }
//
//    @Test
//    void updateEvent() {
//    }
//
//    @Test
//    void deleteEvent() {
//    }
}