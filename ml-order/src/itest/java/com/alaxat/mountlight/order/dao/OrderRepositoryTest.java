package com.alaxat.mountlight.order.dao;

import com.alaxat.mountlight.order.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OrderRepositoryTest {

    public static final String CUSTOMER_ID = "123";

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private OrderRepository repository;

    @Test
    public void testFindByName() {
        entityManager.persist(new Order(CUSTOMER_ID, "Some order"));
        List<Order> orders = repository.findByCustomerId(CUSTOMER_ID);
        assertThat(orders, hasSize(1));
        Order order = orders.get(0);
        assertThat(order.getCustomerId(), is(CUSTOMER_ID));
    }
}