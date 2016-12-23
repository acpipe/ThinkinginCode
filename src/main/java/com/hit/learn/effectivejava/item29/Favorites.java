package com.hit.learn.effectivejava.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Acceml on 2016/11/2.
 */
public class Favorites {
    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void putFavorite(Class<T> tClass, T instance) {
        if(tClass == null) {
            throw new NullPointerException("key is null.");
        }
        map.put(tClass, instance);
    }

    public <T> T getFavorite(Class<T> tClass) {
        return tClass.cast(map.get(tClass));
    }
}
