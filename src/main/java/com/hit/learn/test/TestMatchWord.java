package com.hit.learn.test;

import net.sf.json.JSONObject;

/**
 * Created by Acceml on 2016/11/3.
 */
public class TestMatchWord {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONObject multiJson = jsonObject.optJSONObject("ad_result_info").optJSONObject("multi_ad_info_list");
        System.out.println(multiJson);
    }
}
