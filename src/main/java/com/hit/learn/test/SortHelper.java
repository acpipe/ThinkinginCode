package com.hit.learn.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Acceml on 2016/10/31.
 */
public class SortHelper<T> {
    enum Order {
        INCREASE, DECRESE;
    }

    private final static Map<Class<?>, Map<String, Method>> class2ColumnNameAndGetMethod = new HashMap<>();

    private int sortOrder;

    private String sortClassName;

    private T _obj1, _obj2;

    private Class<? super T> _clazz;

    public SortHelper(Class<? super T> clazz, T obj1, T obj2) {
        sortOrder = 0;
        _obj1 = obj1;
        _obj2 = obj2;
        _clazz = clazz;
        if (class2ColumnNameAndGetMethod.get(clazz) != null) {
            sortClassName = clazz.getName();
            return;
        }

        Method[] methods = clazz.getMethods();
        Map<String, Method> methodMap = new HashMap<>();
        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }

        Map<String, Method> columnMap = new HashMap<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
            columnMap.put(fieldName, methodMap.get(methodName));
        }

        class2ColumnNameAndGetMethod.put(clazz, columnMap);
        sortClassName = clazz.getName();
    }

    public SortHelper with(String columnName, Order order) {
        try {
            if (sortOrder == 0) {
                if (order == Order.DECRESE) {
                    sortOrder = (Integer) class2ColumnNameAndGetMethod.get(_clazz).get(columnName).invoke(_obj1)
                            - (Integer) class2ColumnNameAndGetMethod.get(_clazz).get(columnName).invoke(_obj2);
                } else if (order == Order.INCREASE) {
                    sortOrder = (Integer) class2ColumnNameAndGetMethod.get(_clazz).get(columnName).invoke(_obj2)
                            - (Integer) class2ColumnNameAndGetMethod.get(_clazz).get(columnName).invoke(_obj1);
                } else {
                    sortOrder = 0;
                }
                return this;
            }
        } catch (Exception e) {
            sortOrder = 0;
        }
        return this;
    }

    public int define() {
        return sortOrder;
    }
}
