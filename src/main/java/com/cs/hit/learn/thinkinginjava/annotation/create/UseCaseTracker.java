package com.cs.hit.learn.thinkinginjava.annotation.create;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Acceml on 2016/2/14.
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl) {
        for(Method m : cl.getDeclaredMethods()) {
            UseCase uc =m.getAnnotation(UseCase.class);
            if(uc!=null) {
                System.out.println("id:" + uc.id() + " description:" + uc.description() + " " );
                useCases.remove(new Integer(uc.id()));
            }
        }
        for(int i : useCases) {
            System.out.println("missing use case :" + i );
        }
    }
    public static void main(String [] args) {
        List<Integer> useCases=new ArrayList<Integer>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases,PassWordUtils.class);
    }
}
