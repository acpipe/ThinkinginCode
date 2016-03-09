package com.cs.hit.thinkinginjava.effective.item8.symmetry;

import java.util.ArrayList;
import java.util.List;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            new NullPointerException("String is null");
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        List<CaseInsensitiveString> list = new ArrayList<CaseInsensitiveString>();
        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("HeLLo");
        list.add(caseInsensitiveString);
        if (list.contains(caseInsensitiveString)) {
            System.out.println("true");
        }
    }
}
