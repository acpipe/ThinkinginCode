package com.hit.learn.test;

import java.util.*;

/**
 * Created by Acceml on 2016/10/12.
 */
public class Test {
    public static void main(String[] args) {
        final List<RecommendAd> recommendAds =new ArrayList<>();
        recommendAds.add(new RecommendAd(12, 14));
        recommendAds.add(new RecommendAd(15, 14));
        recommendAds.add(new RecommendAd(15, 13));

        Collections.sort(recommendAds, new Comparator<RecommendAd>() {
            public int compare(RecommendAd o1, RecommendAd o2) {
                    return new SortHelper<>(RecommendAd.class, o1, o2)
                            .with("appId", SortHelper.Order.INCREASE)
                            .define();
            }
        });

        Collections.sort(recommendAds, new Comparator<RecommendAd>() {
            @Override
            public int compare(RecommendAd o1, RecommendAd o2) {
                double result = o2.getA() - o1.getA();
                if (result > 0) {
                    return 1;
                } else if (result < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        Collections.sort(recommendAds, new Comparator<RecommendAd>() {
            @Override
            public int compare(RecommendAd o1, RecommendAd o2) {
                double result = o2.getB() - o1.getB();
                if (result > 0) {
                    return 1;
                } else if (result < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(recommendAds.toString());
    }
}
