package com.hit.learn.test;

import com.google.common.base.MoreObjects;

/**
 * Created by Acceml on 2016/10/27.
 */
public class RecommendAd {
    private int appId;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public RecommendAd(int appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("appId", appId)
                .toString();
    }
}
