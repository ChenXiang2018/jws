package com.cx.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController{

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT username,age FROM tb_user ", new Object[]{});
        return list;
    }
}
