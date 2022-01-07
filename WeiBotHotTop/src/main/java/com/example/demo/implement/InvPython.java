package com.example.demo.implement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * @author YanAemons
 * @date 2022/1/5 20:06
 */
@Component
public class InvPython implements com.example.demo.service.InvPython {

    private String pythonFilePath = "C:\\Users\\Gasshow\\Desktop\\test\\WeiBotHotTop\\src\\main\\java\\com\\example\\demo\\controller\\WeiBoHotTop.py";

    @Override
    public String getList() {
        String result = "";

        try{
            Process process = Runtime.getRuntime().exec("python"+ " " +pythonFilePath );
//            process.waitFor();
            InputStreamReader ir = new InputStreamReader(process.getInputStream(),"gbk");
            LineNumberReader input = new LineNumberReader(ir);
            result = input.readLine();
            System.out.println(result);
            input.close();
            ir.close();

            return result;
        }catch (IOException e) {
            e.printStackTrace();
            return "Wrong";
        }
    }
}
