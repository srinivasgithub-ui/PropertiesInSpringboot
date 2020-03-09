package com.springboot.microservice.application;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class JsonFileGenerator {


    public void m1() {


    JSONArray jsonarray = new JSONArray();

    JSONObject jsonObjectone = new JSONObject();
    JSONObject manJson = new JSONObject();

    manJson.put("sid","1");
    manJson.put("mid","111");
    jsonObjectone.put("student",manJson);

    jsonarray.add(jsonObjectone);


    JSONObject jsonObjecttwo = new JSONObject();
    jsonObjecttwo.put("sid","2");
    jsonObjecttwo.put("mid","22");
    jsonarray.add(jsonObjecttwo);


    JSONObject jsonObjectthree = new JSONObject();
    jsonObjectthree.put("sid","3");
    jsonObjectthree.put("mid","333");
    jsonarray.add(jsonObjectthree);


        System.out.println(jsonarray);

}

}
