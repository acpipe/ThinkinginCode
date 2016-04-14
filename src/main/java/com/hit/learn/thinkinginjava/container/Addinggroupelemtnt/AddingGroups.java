package com.hit.learn.thinkinginjava.container.Addinggroupelemtnt;

import java.util.*;

/**
 * Created by Acceml on 2016/3/30
 * Email: huminghit@gmail.com
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        Integer[] moreInts = {4, 5, 6};
        Collections.addAll(collection, 7, 8, 9);
        Collections.addAll(collection,moreInts);
        List<Integer> list=Arrays.asList(10,11);
        list.set(1,99);
        list.add(12);
    }
}
