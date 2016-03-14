package com.cs.hit.learn.effectivejava.item9;

import java.util.HashMap;
import java.util.Map;

public final class PhoneNumber {

    private final int a;

    public PhoneNumber(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.a == a;
    }

    @Override
    public int hashCode() {
        return 100000;
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(12), "huming");
        if (m.get(new PhoneNumber(12)) == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
    }
}
