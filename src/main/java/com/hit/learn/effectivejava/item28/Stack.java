package com.hit.learn.effectivejava.item28;

import java.util.Collection;

/**
 * Created by Acceml on 2016/10/25.
 */
public class Stack<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(T e) {
        if (ensureCapacity()) {
            elements[size++] = e;
        }
    }

    public T pop() throws Exception {
        if (size == 0) {
            throw new Exception("no item to pop");
        }
        T result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    private boolean ensureCapacity() {
        if (size >= DEFAULT_INITIAL_CAPACITY) {
            return false;
        }
        return true;
    }

    public void pushAll(Collection<? extends T> items) {
        for (T e : items) {
            push(e);
        }
    }

    //把pop出来的东西放到items中
    //进来的是T的子类，出去的最大类型也是T
    public void popAll(Collection<? super T> items) throws Exception {
        while (!isEmpty()) {
            items.add(pop());
        }
    }
}
