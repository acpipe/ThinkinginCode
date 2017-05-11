package com.hit.learn.test;

import net.sf.json.JSONObject;

/**
 * Created by Acceml on 2016/12/6.
 */
public class GravaDebug {
    public static void main(String[] args) {
        String str = "{\"PAGE_VERTICAL\":{\"0\":4028,\"1\":1024},\"PAGE\":{\"0\":4028,\"1\":1024},\"PAGE_POPULAR_HORIZONTAL\":{\"0\":4028,\"1\":1024},\"PAGE_RECOMMEND_HORIZONTAL\":{\"0\":4028,\"1\":1024}}";
        JSONObject jsonObject = JSONObject.fromObject(str);
        System.out.println(jsonObject);
    }
}
