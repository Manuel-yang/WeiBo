package com.example.demo.implement;
import org.json.JSONArray;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author YanAemons
 * @date 2022/1/5 20:06
 */
@Component
public class InvPython implements com.example.demo.service.InvPython {

    private String pythonFilePath = "C:\\Users\\Gasshow\\Desktop\\weibo\\WeiBotHotTop\\src\\main\\java\\com\\example\\demo\\controller\\WeiBoHotTop.py";

    @Override
    public String getList() {
        String result = "";

        try{
            Process process = Runtime.getRuntime().exec("python"+ " " +pythonFilePath );
//            process.waitFor();
            InputStreamReader ir = new InputStreamReader(process.getInputStream(),"gbk");
            LineNumberReader input = new LineNumberReader(ir);
            String line;
            List<String> list = new ArrayList<>();
            while ((line = input.readLine()) != null) {
                list.add(line);
            }
            JSONArray jsonArray=new JSONArray(list);
            input.close();
            ir.close();
            return jsonArray.toString();
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
