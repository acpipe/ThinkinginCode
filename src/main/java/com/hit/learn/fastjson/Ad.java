package com.hit.learn.fastjson;

import com.google.common.base.MoreObjects;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Ad {

    private String keyword;
    private String search_source;
    private String ip;
    private String appids;

    public Ad(String keyword, String search_source, String ip, String appids) {
        this.keyword = keyword;
        this.search_source = search_source;
        this.ip = ip;
        this.appids = appids;
    }

    public Ad() {
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSearch_source() {
        return search_source;
    }

    public void setSearch_source(String search_source) {
        this.search_source = search_source;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAppids() {
        return appids;
    }

    public void setAppids(String appids) {
        this.appids = appids;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("keyword", keyword)
                .add("search_source", search_source)
                .add("ip", ip)
                .add("appids", appids)
                .toString();
    }
}
