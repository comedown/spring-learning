package com.young.springframework.data.access.jdbc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements InitializingBean {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        jdbcTemplate.execute("create table test_table(id integer, value VARCHAR(512), createtime TIMESTAMP default now())");
        jdbcTemplate.execute("insert into test_table (id,value) values(1,'hello world'),(2,'java')");
        jdbcTemplate.execute("insert into test_table values(3,'abcd',now())");
    }
}
