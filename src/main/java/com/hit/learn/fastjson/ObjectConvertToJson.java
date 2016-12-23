package com.hit.learn.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Acceml on 2016/10/12.
 */
public class ObjectConvertToJson {
    public static void main(String[] args) {
        Ad ad = new Ad("huming", "hello", "192.168.1.116", "123");
        //to json object
        JSON json = (JSON) JSON.toJSON(ad);
        System.out.println(json);
        //to java object
        Ad ad1 = JSONObject.parseObject(json.toJSONString(), Ad.class);
        System.out.println(ad1);
    }
}
