package com.jxcoop.center.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> getUserList(){
        List<Map<String,Object>> list=jdbcTemplate.queryForList("SELECT * FROM t_user");
        return list;
    }

}
