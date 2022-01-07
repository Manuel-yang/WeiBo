package com.example.demo.controller;

import com.example.demo.implement.InvPython;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanAemons
 * @date 2022/1/7 14:58
 */
@RestController
public class python {
    @GetMapping("/python")
    public String getList() {
        InvPython invPython = new InvPython();
        return invPython.getList();
    }

    @GetMapping("/")
    public String index() {
        return  "hello";
    }
}
