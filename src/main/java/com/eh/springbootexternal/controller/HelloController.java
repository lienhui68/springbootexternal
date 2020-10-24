package com.eh.springbootexternal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String ttt(Model model) throws SQLException {
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
        model.addAttribute("msg", "你好");
        return "success";
    }


    @GetMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from tbl_employee");
        return list.get(0);
    }
}