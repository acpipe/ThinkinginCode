package com.hit.learn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    public static void main(String[] args) {
        final List<RecommendAd> recommendAds =new ArrayList<>();
        recommendAds.add(new RecommendAd(12));
        recommendAds.add(new RecommendAd(15));
        Collections.sort(recommendAds, new Comparator<RecommendAd>() {
            public int compare(RecommendAd o1, RecommendAd o2) {
                    return new SortHelper<>(RecommendAd.class, o1, o2)
                            .with("appId", SortHelper.Order.INCREASE)
                            .define();
            }
        });
        System.out.println(recommendAds.toString());
    }
}
