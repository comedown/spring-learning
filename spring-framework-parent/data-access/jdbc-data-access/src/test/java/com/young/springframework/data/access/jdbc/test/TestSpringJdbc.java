package com.young.springframework.data.access.jdbc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jdbc.xml"})
public class TestSpringJdbc {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInitializer() {
//        jdbcTemplate.query("select value from test_table where id = 2", null);
    }

}
