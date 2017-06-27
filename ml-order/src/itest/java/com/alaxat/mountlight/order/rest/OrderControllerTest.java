package com.alaxat.mountlight.order.rest;

import com.alaxat.mountlight.order.dao.OrderRepository;
import com.alaxat.mountlight.order.entity.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static com.alaxat.mountlight.order.dao.OrderRepositoryTest.CUSTOMER_ID;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerTest {

    MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;
    @Autowired
    private OrderRepository repository;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testGetCustomerOrders() throws Exception {
        repository.save(new Order(CUSTOMER_ID, "Some order"));
        repository.save(new Order(CUSTOMER_ID, "Some order 2"));

        mockMvc.perform(get("/orders/customer/" + CUSTOMER_ID)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].customerId", is(CUSTOMER_ID)));
    }
}