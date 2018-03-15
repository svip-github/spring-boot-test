package com.jxcoop.center.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoTest {
    private final static Logger logger = LoggerFactory.getLogger(DemoTest.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("")
    public List<Map<String,Object>> hello() {

        return jdbcTemplate.queryForList("SELECT * FROM t_user");
    }
}
