package com.edu.bigdata;


import com.edu.bigdata.common.AppLogEntity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/**
 * 数据上传的工具类
 */
public class UploadUtil {
    /**
     * 上传日志
     */
    public static void upload(String json) throws Exception {
        try {
           /* // 1 设置请求的 URL
            // URL url = new URL("http://hadoop102:8080/app_logs/coll/index"); // 生产地址
            URL url = new URL("http://localhost:8080/coll/index"); // 测试地址

            // 2 获取连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 2.1 设置请求方式为 post
            conn.setRequestMethod("POST");

            // 2.2 允许上传数据使能
            conn.setDoOutput(true);

            // 2.3 时间头用来供 server 进行时钟校对
            conn.setRequestProperty("clientTime", System.currentTimeMillis() + "");

            // 2.4 设置请求的头信息，设置内容类型
            conn.setRequestProperty("Content-Type", "application/json");

            // 3 获取输出流
            OutputStream out = conn.getOutputStream();
            // 3.1 向输出流里面写数据
            out.write(json.getBytes());
            out.flush();
            // 3.2 关闭资源
            out.close();

            // 4 获取响应码
            int code = conn.getResponseCode();
            System.out.println(code);*/
            RestTemplate restTemplate=new RestTemplate();
            String url="http://139.198.16.62:8080/coll/index";
            URI uri=new URI(url);
            HttpHeaders headers=new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setDate("clientTime",System.currentTimeMillis());
            HttpEntity<String> entity=new HttpEntity<>(json,headers);
            ResponseEntity<AppLogEntity> response=restTemplate.exchange(uri,HttpMethod.POST,entity,AppLogEntity.class);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}