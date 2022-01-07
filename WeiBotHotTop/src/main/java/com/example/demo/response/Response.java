package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author YanAemons
 * @date 2022/1/7 15:14
 */
@Data
@AllArgsConstructor
public class Response {
    private int status;
    private String msg;
    private Object object;
}
