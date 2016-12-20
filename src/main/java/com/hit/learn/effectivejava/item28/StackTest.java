package com.hit.learn.effectivejava.item28;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acceml on 2016/10/25.
 */
public class StackTest {
    public static void main(String[] args) {
        //压入String类型的，弹出Object类型的
        List<String> list = new ArrayList<>();
        list.add("huming");
        list.add("hello");
        Stack<String> stack = new Stack<>();
        stack.pushAll(list);
        List<Object> result = new ArrayList<>();
        try {
            stack.popAll(result);
        } catch (Exception e) {
            System.out.println("ex");
        }
        System.out.println(result);
    }
}
