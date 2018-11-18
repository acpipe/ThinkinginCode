package com.hit.learn.boolindex;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonAd {
    public static void main(String[] args) {
        List<Long> list = Stream.of("1,24,4", "2,4,5")
            .map(e -> e.split(","))
            .flatMap(Arrays::stream)
            .map(Long::valueOf)
            .distinct()
            .sorted().collect(Collectors.toList());
        System.out.println(list);
    }

}
