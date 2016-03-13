package com.cs.hit.learn.effectivejava.item16;

import java.util.Collection;
import java.util.Set;

/**
 * Created by Acceml on 2016/3/13.
 */
public class InstrumentedHash<T> extends ForwordingSet<T>{
    private int count=0;
    public InstrumentedHash(Set<T> set) {
        super(set);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        count+=c.size();
        return super.addAll(c);
    }

    @Override
    public boolean add(T t) {
        count++;
        return super.add(t);
    }

    public int getCount() {
        return count;
    }
}
